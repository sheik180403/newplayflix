package com.login.service;

import org.springframework.stereotype.Service;

import com.login.entity.UserDetails;

@Service
public interface UserService {

	UserDetails create(UserDetails userEntity);
	
	
	boolean vaid(String email,String password0);
}
