package com.example.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.userentities;
import com.example.exception.CustomerAlreadyExistsException;
import com.example.exception.errorresponse;
import com.example.userservice.userservice;

@RestController
@RequestMapping(value="/customers")
public class usercontroller {

	@Autowired
	userservice us;
	
	@RequestMapping(value="/adduser", method=RequestMethod.POST)
	public String createuser(@RequestBody userentities uss) {
		return us.adduser(uss);
		
	}

	
	
	   @ExceptionHandler(value= CustomerAlreadyExistsException.class)
	  @ResponseStatus(HttpStatus.CONFLICT) public errorresponse
	  handleCustomerAlreadyExistsException(CustomerAlreadyExistsException ex){
	  return new errorresponse(HttpStatus.CONFLICT.value(),ex.getMessage()); 
	  }
	 
	@RequestMapping(value="/getuserbyid/{id}")
	public userentities getuser(@PathVariable Long id) {
		return us.getuserbyid(id);
	}
	
	@RequestMapping(value="/updateuserbyid")
	public String updateuser(@RequestBody userentities userentities) {
		return us.updateuser(userentities);
	}

}

