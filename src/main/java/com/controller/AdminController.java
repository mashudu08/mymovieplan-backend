package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Booking;
import com.model.Genre;
import com.service.GenreService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = { "http://localhost:4200" })
public class AdminController {

	@Autowired
	private GenreService genreService;

	// <--- Movie Genre --->
	// TODO update genre section

	// Request to get all movie genres
	@GetMapping("/get-genres")
	public List<Genre> getAllGenres() {
		return genreService.readAll();
	}

	// Request to get added genre
	@GetMapping("/get-genre/{id}")
	public Genre findGenreById(@PathVariable("id") Integer id) {
		return genreService.read(id);
	}

	// Add a genre
	@PostMapping("/add-genre")
	public Genre addGenre(@RequestBody Genre genre) {
		return genreService.create(genre);
	}

	// create movie
	@DeleteMapping("/genre/{id}")
	public Genre removeGenre(@PathVariable("id") Integer id) {
		return genreService.delete(id);
	}
}
