package com.training.mongoDb.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.mongoDb.model.users;
import com.training.mongoDb.repository.userRepository;

@Service
public class userService {
	@Autowired
	private userRepository userRepo;
	public String createUser(String name, String password, String email, BigInteger contact) {
		users user = new users(
				name,
				password,
				email,
				contact
				);
		userRepo.save(user);
		return ("New user created with ID" + user.getId());
	}
	
	public List<users> listUsers(){
		return userRepo.findAll();
	}
}
