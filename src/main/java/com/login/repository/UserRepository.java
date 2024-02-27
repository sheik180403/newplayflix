package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.entity.UserDetails;


@Repository
public interface UserRepository extends JpaRepository<UserDetails, String> {
	UserDetails findByEmailAndPassword(String email,String password);
	
}
