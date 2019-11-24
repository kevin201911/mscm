package com.mscloudmesh.oauth2.common.service;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * 请求权限判断service
 *
 * @author kevin
 * @date 2019-11-09
 */
public interface IPermissionService {
    /**
     * 判断请求是否有权限
     * 
     * @param authentication 认证信息
     * @return 是否有权限
     */
    boolean hasPermission(HttpServletRequest request, Authentication authentication);
}
