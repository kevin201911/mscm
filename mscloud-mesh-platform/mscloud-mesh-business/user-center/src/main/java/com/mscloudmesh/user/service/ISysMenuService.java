package com.mscloudmesh.user.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.mscloudmesh.common.model.SysPermission;
import com.mscloudmesh.common.vo.Tree;
import com.mscloudmesh.user.model.SysPermissionNode;

import java.util.List;

/**
 * @author kevin
 * @date 2019-11-09
 */
public interface ISysMenuService extends IService<SysPermission> {

	List<Tree<SysPermission>> getPermissionsByUserId(Long id);

	List<SysPermissionNode> treeList();

	int updateShowStatus(List<Long> ids, Integer showStatus);
	/**
	 * 查询所有菜单
	 */
	List<SysPermission> findAll();

	/**
	 * 查询所有一级菜单
	 */
	List<SysPermission> findOnes();



}
