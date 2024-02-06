package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer genreId;
	private String genreName;
	
	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genre(Integer genreId, String genreName) {
		super();
		this.genreId = genreId;
		this.genreName = genreName;
	}

	public Integer getGenreId() {
		return genreId;
	}

	public void setGenreId(Integer genreId) {
		this.genreId = genreId;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	@Override
	public String toString() {
		return "Genre [genreId=" + genreId + ", genreName=" + genreName + "]";
	}
	

}
