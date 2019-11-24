package com.mscloudmesh.user.service;



import com.mscloudmesh.user.vo.OssCallbackResult;
import com.mscloudmesh.user.vo.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 * @author kevin
 * @date 2019-11-09
 */
public interface OssService {
    OssPolicyResult policy();

    OssCallbackResult callback(HttpServletRequest request);
}
