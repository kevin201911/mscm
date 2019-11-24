package com.mscloudmesh.common.annotation;

import java.lang.annotation.*;

/**
 * 忽略Token验证
 *
 * @author kevin
 * @date 2019-11-09
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreAuth {

}
