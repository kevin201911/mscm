package com.mscloudmesh.oauth.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author kevin
 * @date 2019-11-09
 */
public interface ZltUserDetailsService extends UserDetailsService {
    /**
     * 根据电话号码查询用户
     *
     * @param mobile
     * @return
     */
    UserDetails loadUserByMobile(String mobile);
}
