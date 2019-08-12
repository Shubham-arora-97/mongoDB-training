package com.training.mongoDb.controller;

import java.util.List;
import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.training.mongoDb.service.userService;

abstract

@RestController
public class userController {
	@Autowired
	private userService userService;
	
	@PostMapping("/add")
    public String createUser(
            @RequestParam("name") String name,
            @RequestParam("password") String password,
            @RequestParam("email") String email,
            @RequestParam("contact")BigInteger contact
            ) {
        return userService.createUser(name,password,email,contact);
    }

    @GetMapping("/list")
    public List<?> listUsers(){
        return userService.listUsers();
    }
	
}
