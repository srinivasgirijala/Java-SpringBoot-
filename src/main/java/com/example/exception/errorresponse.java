package com.example.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class errorresponse {

	private int statuscode;
	private String message;
	public errorresponse(String message) {
		super();
		this.message=message;
		
	}
	
}
