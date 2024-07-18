package org.quanta.base.exception;

/**
 * Description:
 * Author: DJ
 * Date: 2024/7/18
 */
public class RetryException extends RuntimeException{
    public RetryException() {
    }

    public RetryException(String message) {
        super(message);
    }
}
