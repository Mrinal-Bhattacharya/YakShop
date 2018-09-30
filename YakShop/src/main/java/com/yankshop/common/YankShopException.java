package com.yankshop.common;

public class YankShopException extends Exception {

	private String message;

	public YankShopException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
