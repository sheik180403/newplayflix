package com.login.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.login.entity.UserDetails;
import com.login.repository.UserRepository;
import com.login.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails create(UserDetails userDetails) {
		
		return userRepository.save(userDetails);
	}

	@Override
	public boolean vaid(String email, String password0) {
		UserDetails findByEmailAndPassword = userRepository.findByEmailAndPassword(email, password0);
		return findByEmailAndPassword!=null ;
	}
}
