package com.mscloudmesh.gateway.feign;


import com.mscloudmesh.gateway.feign.fallback.MenuServiceFallbackFactory;
import com.mscloudmesh.common.constant.ServiceNameConstants;
import com.mscloudmesh.common.model.SysPermission;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author kevin
 * @date 2019-11-09
 */
@FeignClient(name = ServiceNameConstants.USER_SERVICE, fallbackFactory = MenuServiceFallbackFactory.class, decode404 = true)
public interface MenuService {
	/**
	 * 角色菜单列表
	 * @param roleCodes
	 */
	@GetMapping(value = "/menus/{roleCodes}")
	List<SysPermission> findByRoleCodes(@PathVariable("roleCodes") String roleCodes);
}
