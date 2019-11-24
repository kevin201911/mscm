package com.mscloudmesh.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.mscloudmesh.common.constant.CommonConstant;
import com.mscloudmesh.common.lock.DistributedLock;
import com.mscloudmesh.common.model.SysRole;
import com.mscloudmesh.common.model.SysRoleMenu;
import com.mscloudmesh.user.mapper.SysRoleMapper;
import com.mscloudmesh.user.mapper.SysRolePermissionMapper;
import com.mscloudmesh.user.mapper.SysUserRoleMapper;
import com.mscloudmesh.user.service.ISysRolePermissionService;
import com.mscloudmesh.user.service.ISysRoleService;
import com.mscloudmesh.user.service.ISysUserRoleService;
import com.mscloudmesh.user.vo.UserRoleResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author kevin
 * @date 2019-11-09
 */
@Slf4j
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {
    private final static String LOCK_KEY_ROLECODE = CommonConstant.LOCK_KEY_PREFIX + "rolecode:";
    @Resource
    private SysRoleMapper roleMapper;
    @Resource
    private SysUserRoleMapper userRoleMapper;

    @Resource
    private SysRolePermissionMapper roleMenuMapper;
    @Resource
    private ISysUserRoleService userRoleService;
    @Resource
    private ISysRolePermissionService rolePermissionService;


    @Autowired
    private DistributedLock lock;

    @Override
    public List<SysRoleMenu> getRolePermission(Long roleId) {
        return roleMenuMapper.selectList(new QueryWrapper<SysRoleMenu>().eq("role_id", roleId));
    }

    @Override
    public boolean saves(SysRole role) {
        role.setCreateTime(new Date());

        roleMapper.insert(role);
        updatePermission(role.getId(), role.getMenuIds());
        return true;
    }

    @Override
    public boolean updates(SysRole role) {
        role.setId(role.getId());
        updatePermission(role.getId(), role.getMenuIds());
        roleMapper.updateById(role);
        return true;
    }

    @Override
    public List<UserRoleResult> userRoleCheck(List<SysRole> rolesByUserId) {

        List<SysRole> list = this.list();
        List<UserRoleResult> result = new ArrayList<UserRoleResult>();
        for (SysRole role : list) {
            UserRoleResult userRoleResult
                    = new UserRoleResult();
           userRoleResult.setCode(role.getCode());
           userRoleResult.setName(role.getName());
           userRoleResult.setId(role.getId());
           if (rolesByUserId.contains(role))
             userRoleResult.setChecked(true);
           result.add(userRoleResult);
        }

        return result;
    }

    public void updatePermission(Long roleId, String permissionIds) {

        //先删除原有关系
        roleMenuMapper.delete(new QueryWrapper<SysRoleMenu>().eq("role_id", roleId));
        //批量插入新关系
        List<SysRoleMenu> relationList = new ArrayList<>();
        if (!StringUtils.isEmpty(permissionIds)) {
            String[] mids = permissionIds.split(",");
            for (String permissionId : mids) {
                SysRoleMenu relation = new SysRoleMenu();
                relation.setRoleId(roleId);
                relation.setMenuId(Long.valueOf(permissionId));
                relationList.add(relation);
            }
            rolePermissionService.saveBatch(relationList);
        }

    }
}
