package com.mscloudmesh.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mscloudmesh.common.model.SysPermission;

import java.util.List;

/**
 * 菜单
 *
 * @author kevin
 * @date 2019-11-09
 */
public interface SysMenuMapper extends BaseMapper<SysPermission> {

    List<SysPermission> listMenuByUserId(Long id);

    List<SysPermission> listPermissByUserId(Long roleId);

}
