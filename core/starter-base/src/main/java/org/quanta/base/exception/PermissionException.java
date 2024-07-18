package org.quanta.base.exception;

/**
 * Description: 权限异常
 * Author: DJ
 * Date: 2024/7/18
 */
public class PermissionException extends RuntimeException{
    public PermissionException() {
        super();
    }

    public PermissionException(String message) {
        super(message);
    }
}
