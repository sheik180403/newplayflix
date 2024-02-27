package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.UserDetails;
import com.login.serviceimpl.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;
	
	@PostMapping(value = "/create")
	public UserDetails createUser(@RequestBody UserDetails  userEntity) {
		return userServiceImpl.create(userEntity) ;

	}
	
	
	@GetMapping(value="/login/{email}/{password}")
	public ResponseEntity<String> login(@PathVariable String email,@PathVariable String password) {
		
		if(userServiceImpl.vaid(email, password)) {
			return ResponseEntity.ok("success");
		}
		else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("invalid");
		}
}
}
