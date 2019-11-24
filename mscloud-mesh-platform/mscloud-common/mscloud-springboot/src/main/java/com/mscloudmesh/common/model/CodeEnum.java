package com.mscloudmesh.common.model;

/**
 * @author kevin
 * @date 2019-11-09
 */
public enum CodeEnum {
    SUCCESS(200),
    ERROR(1);

    private Integer code;
    CodeEnum(Integer code){
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
