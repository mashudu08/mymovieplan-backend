package com.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://localhost:4200"})
public class UserController {
	
//	@Autowired
//	private UserService userService;
	
	//create user
	//get user by id
	
	// TODO authenticate for login and sign up
    // TODO sign up create user
	//TODO login get user by passing the password and user name
}
