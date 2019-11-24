package com.mscloudmesh.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mscloudmesh.common.model.SysRoleUser;
import com.mscloudmesh.user.mapper.SysUserRoleMapper;
import com.mscloudmesh.user.service.ISysUserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和角色关系表 服务实现类
 * </p>
 *
 * @author kevin
 * @date 2019-11-09
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysRoleUser> implements ISysUserRoleService {

}
