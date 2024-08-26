package com.Spring.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.entity.users;
import com.Spring.repository.UserRepository;



@Service("userService")
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	 public users saveUser(users user){
	        return userRepository.save(user);
	    }
	 
	 public List<users> getAllUsers() {
	        return userRepository.findAll();
	 }
	
	 
	 public Optional<users> getUserByEmail(String email) {
	        return userRepository.findByEmail(email);
	    }
	 


}
