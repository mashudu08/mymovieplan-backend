package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Movie;
import com.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository mr;
	
	//create
	public Movie create(Movie movie) {
		return mr.save(movie);
	}
		
	//read all
	public List<Movie> read(){
		return mr.findAll();
	}
		
	//read by id
	public Movie read(Integer id) {
		Optional<Movie> temp = mr.findById(id);
		Movie movie = null;
			if(temp.isPresent())
			{
				movie = temp.get();
			}
			return movie;
		}
		
		//update
		public Movie update(Movie movie) {
		Optional<Movie> temp = mr.findById(movie.getMovieId());
			if(temp.isPresent())
			{
				mr.save(movie);
				return movie;
			}else {
				return null;
			}
		}
		
//		public List<Movie> getAllDisabledMovies(Integer id) {
//		    return mr.findById(null);
//		}
		
//		//delete/ disable
//		public Movie delete(Integer id) {
//			Optional<Movie> temp = mr.findById(id);  
//			Movie movie = null;
//			if(temp.isPresent())
//			{
//				movie = temp.get();
//				mr.delete(movie);
//			}
//				return movie;
//			
//		}
	}

