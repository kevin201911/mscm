package com.mscloudmesh.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author kevin
 * @date 2019-11-09
 */
@Data
public class SmsCode implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7353129036120185186L;
	//短信流水号
	private String key;
}
