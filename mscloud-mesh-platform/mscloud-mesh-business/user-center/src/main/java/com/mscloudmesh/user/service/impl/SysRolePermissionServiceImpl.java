package com.mscloudmesh.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.mscloudmesh.common.model.SysRoleMenu;
import com.mscloudmesh.user.mapper.SysRolePermissionMapper;
import com.mscloudmesh.user.service.ISysRolePermissionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户角色和权限关系表 服务实现类
 * </p>
 *
 * @author kevin
 * @date 2019-11-09
 */
@Service
public class SysRolePermissionServiceImpl extends ServiceImpl<SysRolePermissionMapper, SysRoleMenu> implements ISysRolePermissionService {

}
