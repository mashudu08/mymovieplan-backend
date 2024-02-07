package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Genre;
import com.repository.GenreRepository;

@Service
public class GenreService {

	@Autowired
	private GenreRepository gr;

	// create
	public Genre create(Genre genre) {
		return gr.save(genre);
	}

	// read all
	public List<Genre> readAll() {
		return gr.findAll();
	}

	// read by id
	public Genre read(Integer id) {
		Optional<Genre> temp = gr.findById(id);
		Genre genre = null;
		if (temp.isPresent()) {
			genre = temp.get();
		}
		return genre;
	}

	// delete
	public Genre delete(Integer id) {
		Optional<Genre> temp = gr.findById(id);
		Genre genre = null;
		if (temp.isPresent()) {
			genre = temp.get();
			gr.delete(genre);
		}
		return genre;

	}

}
