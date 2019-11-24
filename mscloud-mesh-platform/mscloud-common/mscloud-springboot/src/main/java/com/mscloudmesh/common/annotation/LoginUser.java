package com.mscloudmesh.common.annotation;

import java.lang.annotation.*;

/**
 * @author kevin
 * @date 2019-11-09
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginUser {
    /**
     * 是否查询SysUser对象所有信息，true则通过rpc接口查询
     */
    boolean isFull() default false;
}
