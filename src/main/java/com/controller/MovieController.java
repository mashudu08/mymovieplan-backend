package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Movie;
import com.service.MovieService;

@RestController
@RequestMapping("/movies")
@CrossOrigin(origins = {"http://localhost:4200"})
public class MovieController {
	@Autowired
	private MovieService ms;
	
	// get all movies
	  @GetMapping("/get-movies")
	  public List<Movie> retrieveAllMovies() 
	  {
		  return ms.read();
	  }
	  
	  @GetMapping("/movies/{id}")
	 public Movie findMovieById(@PathVariable("id") Integer id)
	  {
		  return ms.read(id);
	  }
	 
	  // add movie as admin
	  @PostMapping("/add-movie")
	 public Movie addMovie(@RequestBody Movie movie) 
	 {
		  return ms.create(movie);
	 }
	 
	  //update movie as admin
	  @PutMapping("/update-movie")
	 public Movie updateMovie(@RequestBody Movie movie) 
	 {
		  return ms.update(movie);
	 }
	 
	  //TODO: fetch movies by category do in frontend
	  
}
