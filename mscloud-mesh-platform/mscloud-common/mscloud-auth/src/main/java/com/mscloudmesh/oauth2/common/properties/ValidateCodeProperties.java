package com.mscloudmesh.oauth2.common.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * 验证码配置
 *
 * @author kevin
 * @date 2019-11-09
 */
@Setter
@Getter
public class ValidateCodeProperties {
    /**
     * 设置认证通时不需要验证码的clientId
     */
    private String[] ignoreClientCode = {};
}
