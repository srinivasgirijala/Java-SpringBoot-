package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class globalexceptionhandler {

	@ExceptionHandler(value= NoSuchCustomerExistsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
public @ResponseBody errorresponse handleCustomerAlreadyExistsException1(NoSuchCustomerExistsException ex){
return new errorresponse(HttpStatus.NOT_FOUND.value(),ex.getMessage());
}
}