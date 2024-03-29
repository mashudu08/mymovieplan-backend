package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://localhost:4200"})
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//create user
	@PostMapping("/register")
	public User addUser(@RequestBody User user) 
	{
		return userService.create(user);
	}
	
	//get user by id
	 @GetMapping("/user/{id}")
	 public User findUserById(@PathVariable("id") Integer id)
	  {
		  return userService.read(id);
	  }
	
	
	// TODO authenticate for login and sign up
    // TODO sign up create user
	//TODO login get user by passing the password and user name
}
