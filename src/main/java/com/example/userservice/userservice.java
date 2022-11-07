package com.example.userservice;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.entity.userentities;
import com.example.exception.CustomerAlreadyExistsException;
import com.example.exception.NoSuchCustomerExistsException;
import com.example.repository.userrepository;
import com.example.serviceinterface.Serviceinterfacee;

@Service
public  class userservice implements Serviceinterfacee{

	
	@Autowired
	userrepository repo;
	
	public String adduser(userentities userentities) {
	 userentities userrecords=repo.findByEmail(userentities.getEmail());
		if(userrecords==null) {
			repo.save(userentities);
			return "user successfully created";
		}
		else {
			throw new CustomerAlreadyExistsException("user already exists!");
		}
		
	}

	public userentities getuserbyid(long id) {
		userentities userrecords=repo.findById(id).orElseThrow( () -> new NoSuchCustomerExistsException("no user exist with id:"+id));
		return userrecords;
	}
	
	
	  public String updateuser(userentities userentities) { userentities
	  userrecords=repo.findById(userentities.getId()).orElse(null); if
	  (userrecords==null) { throw new
	  NoSuchCustomerExistsException("no user exist with id"); }
	  
	  else {
	  
	  userrecords.setEmail(userentities.getEmail());
	  userrecords.setAddress(userentities.getAddress()); 
	  userrecords.setUserupdateddate(userentities.getUserupdateddate());
	  repo.save(userrecords);
	  return "user updated successfully"; } }
	 
	
}
