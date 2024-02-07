package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Genre;
import com.service.GenreService;

@RestController
@RequestMapping("/genre")
@CrossOrigin(origins = {"http://localhost:4200"})
public class GenreController {
	@Autowired
	private GenreService genreService;
	
	//create user
	@PostMapping("/add-genre")
	public Genre addUser(@RequestBody Genre genre) 
	{
		return genreService.create(genre);
	}
	
	//get user by id
	 @GetMapping("/genre/{id}")
	 public Genre findUserById(@PathVariable("id") Integer id)
	  {
		  return genreService.read(id);
	  }
}
