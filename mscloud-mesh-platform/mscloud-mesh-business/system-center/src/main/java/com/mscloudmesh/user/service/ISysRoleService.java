package com.mscloudmesh.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mscloudmesh.common.model.SysRole;
import com.mscloudmesh.common.model.SysRoleMenu;
import com.mscloudmesh.user.vo.UserRoleResult;

import java.util.List;

/**
 * @author kevin
 * @date 2019-11-09
 */
public interface ISysRoleService extends IService<SysRole> {
	public List<SysRoleMenu> getRolePermission(Long roleId);

	boolean saves(SysRole entity);

	boolean updates(SysRole entity);


	List<UserRoleResult> userRoleCheck(List<SysRole> rolesByUserId);
}
