package com.mscloudmesh.oauth.config;

import com.mscloudmesh.db.config.DefaultMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author kevin
 * @date 2019-11-09
 */
@Configuration
@MapperScan({"com.mscloudmesh.oauth.mapper*"})
public class MybatisPlusConfig extends DefaultMybatisPlusConfig {

}
