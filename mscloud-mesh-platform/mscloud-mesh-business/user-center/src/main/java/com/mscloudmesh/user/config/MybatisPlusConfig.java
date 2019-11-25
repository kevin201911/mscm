package com.mscloudmesh.user.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.mscloudmesh.db.config.DefaultMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kevin
 * @date 2019-11-09
 */
@Configuration
@MapperScan({"com.mscloudmesh.user.mapper*"})
public class MybatisPlusConfig extends DefaultMybatisPlusConfig {
    /**
     * 逻辑删除注入器
     */
    @Bean
    public ISqlInjector sqlInjector(){
        return new LogicSqlInjector();
    }
}
