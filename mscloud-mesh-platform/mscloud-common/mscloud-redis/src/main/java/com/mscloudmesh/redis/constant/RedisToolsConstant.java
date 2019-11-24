package com.mscloudmesh.redis.constant;

/**
 * redis 工具常量
 *
 * @author kevin
 * @date 2019-11-09
 */
public class RedisToolsConstant {
    private RedisToolsConstant() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * single Redis
     */
    public final static int SINGLE = 1 ;

    /**
     * Redis cluster
     */
    public final static int CLUSTER = 2 ;
}
