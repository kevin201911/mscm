package com.mscloudmesh.common.exception;

/**
 * 幂等性异常
 *
 * @author kevin
 * @date 2019-11-09
 */
public class IdempotencyException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    public IdempotencyException(String message) {
        super(message);
    }
}
