package com.mscloudmesh.oauth.service;



import com.mscloudmesh.common.model.Result;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kevin
 * @date 2019-11-09
 */
public interface IValidateCodeService {
    /**
     * 保存图形验证码
     * @param client_id 前端唯一标识
     * @param imageCode 验证码
     */
    void saveImageCode(String client_id, String imageCode);

    Result sendSmsCode(String mobile);

    /**
     * 获取验证码
     * @param client_id 前端唯一标识/手机号
     */
    String getCode(String client_id);

    /**
     * 删除验证码
     * @param client_id 前端唯一标识/手机号
     */
    void remove(String client_id);

    /**
     * 验证验证码
     */
    void validate(HttpServletRequest request);
}
