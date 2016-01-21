package com.framework.base.web;

import java.util.ArrayList;
import java.util.List;


public class BaseWebResult {
	
	private int isSuccess = 1;
	
	private String message;
	
	private String code;
	
	private List<Object> data = new ArrayList<Object>();

	public int getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(int isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
}
