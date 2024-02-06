package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

@Service
public class UserService {
 
	@Autowired
	private UserRepository ur;
	
	//create
	public User create(User user) {
		return ur.save(user);
	}
	
	//read all
	public List<User> read(){
		return ur.findAll();
	}
	
	//read by id
	public User read(Integer id) {
		Optional<User> temp = ur.findById(id);
		User user = null;
		if(temp.isPresent())
		{
			user = temp.get();
		}
		return user;
	}
	
	//update
	public User update(User user) {
		Optional<User> temp = ur.findById(user.getUserId());
		if(temp.isPresent())
		{
			ur.save(user);
			return user;
		}else {
			return null;
		}
	}
	
	//delete
	public User delete(Integer id) {
		Optional<User> temp = ur.findById(id);  
		User user = null;
		if(temp.isPresent())
		{
			user = temp.get();
			ur.delete(user);
		}
			return user;
		
	}
}
