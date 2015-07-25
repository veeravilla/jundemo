package com.test.cxf;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ServiceError {

	private String error;
	private String msg;
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public ServiceError(String error, String msg) {
		super();
		this.error = error;
		this.msg = msg;
	}
	public ServiceError() {
		super();
	}
	
}
