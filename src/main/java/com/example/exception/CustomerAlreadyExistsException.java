package com.example.exception;

public class CustomerAlreadyExistsException extends RuntimeException{

	private String message;
	public CustomerAlreadyExistsException(String msg) {
		super(msg);
		this.message=msg;
		
	}
}
