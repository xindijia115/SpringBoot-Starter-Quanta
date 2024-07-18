package org.quanta.base.exception;

/**
 * Description: 自定义业务异常
 * Author: DJ
 * Date: 2024/7/18
 */
public class ServiceException extends RuntimeException {

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }
}
