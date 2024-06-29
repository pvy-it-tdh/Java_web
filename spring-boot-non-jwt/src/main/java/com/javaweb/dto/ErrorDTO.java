package com.javaweb.dto;

import java.util.ArrayList;
import java.util.List;

public class ErrorDTO {
	private String error;
	private List<String> detail =new ArrayList<String>();

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public List<String> getDetail() {
		return detail;
	}

	public void setDetail(List<String> detail) {
		this.detail = detail;
	}
}
