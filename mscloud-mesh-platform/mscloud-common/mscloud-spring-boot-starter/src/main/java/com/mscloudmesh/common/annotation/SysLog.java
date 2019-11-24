package com.mscloudmesh.common.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 *
 * @author kevin
 * @date 2019-11-09
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    String MODULE() default "操作模块";
    String REMARK() default "操作日志";
}
