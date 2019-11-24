package com.mscloudmesh.gateway.service.impl;

import com.mscloudmesh.gateway.feign.MenuService;
import com.mscloudmesh.common.model.SysPermission;
import com.mscloudmesh.oauth2.common.service.impl.DefaultPermissionServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 请求权限判断service
 *
 * @author kevin
 * @date 2019-11-09
 */
@Slf4j
@Service("permissionService")
public class PermissionServiceImpl extends DefaultPermissionServiceImpl {
    @Resource
    private MenuService menuService;

    @Override
    public List<SysPermission> findMenuByRoleCodes(String roleCodes) {
        return menuService.findByRoleCodes(roleCodes);
    }
}
