package com.example.exception;

public class NoSuchCustomerExistsException extends RuntimeException{

	private String message;
	public NoSuchCustomerExistsException(String msg) {
		super(msg);
		this.message=msg;
	}
}
