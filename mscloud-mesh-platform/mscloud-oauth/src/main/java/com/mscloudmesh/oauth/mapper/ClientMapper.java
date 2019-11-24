package com.mscloudmesh.oauth.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.mscloudmesh.db.mapper.SuperMapper;
import com.mscloudmesh.oauth.model.Client;
import org.apache.ibatis.annotations.Param;



/**
 * @author kevin
 * @date 2019-11-09
 */
public interface ClientMapper extends SuperMapper<Client> {
    List<Client> findList(Page<Client> page, @Param("params") Map<String, Object> params);
}
