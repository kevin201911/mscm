package com.mscloudmesh.oauth.service;


import com.mscloudmesh.common.model.PageResult;
import com.mscloudmesh.common.model.Result;
import com.mscloudmesh.common.service.ISuperService;
import com.mscloudmesh.oauth.model.Client;

import java.util.Map;

/**
 * @author kevin
 * @date 2019-11-09
 */
public interface IClientService extends ISuperService<Client> {
    Result saveClient(Client clientDto);

    /**
     * 查询应用列表
     * @param params
     * @param isPage 是否分页
     */
    PageResult<Client> listClent(Map<String, Object> params, boolean isPage);

    void delClient(long id);
}
