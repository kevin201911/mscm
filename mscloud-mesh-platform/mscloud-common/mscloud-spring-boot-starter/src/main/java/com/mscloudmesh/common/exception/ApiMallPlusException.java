package com.mscloudmesh.common.exception;

/**
 * 自定义异常
 *
 * @author kevin
 * @date 2019-11-09
 */
public class ApiMallPlusException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String errmsg;
    private int errno = 500;

    public ApiMallPlusException(String errmsg) {
        super(errmsg);
        this.errmsg = errmsg;
    }

    public ApiMallPlusException(String errmsg, Throwable e) {
        super(errmsg, e);
        this.errmsg = errmsg;
    }

    public ApiMallPlusException(String errmsg, int errno) {
        super(errmsg);
        this.errmsg = errmsg;
        this.errno = errno;
    }

    public ApiMallPlusException(String errmsg, int errno, Throwable e) {
        super(errmsg, e);
        this.errmsg = errmsg;
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }
}
