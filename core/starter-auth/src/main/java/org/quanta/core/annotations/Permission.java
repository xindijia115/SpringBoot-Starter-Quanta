package org.quanta.core.annotations;

import org.quanta.core.constants.Role;

import java.lang.annotation.*;

/**
 * Description: 权限拦截注解
 * Author: DJ
 * Date: 2024/7/18
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Permission {
    Role[] value();
}
