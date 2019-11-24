package com.mscloudmesh.common.exception;

/**
 * 分布式锁异常
 *
 * @author kevin
 * @date 2019-11-09
 */
public class LockException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    public LockException(String message) {
        super(message);
    }
}
