package com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movieId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="genreId", referencedColumnName = "genreId")
	private Genre genre;
	
	private String movieName;
	private Integer ticketPrice;
	private String language;
	private String description;
	private String showTimings;
	private boolean enabled;
	
	public Movie() {
		super();
		// constructor without the movie id
	}

	public Movie(Integer movieId, Genre genre, String movieName, Integer ticketPrice, String langauge,
			String description, String showTimings, boolean enabled) {
		super();
		this.movieId = movieId;
		this.genre = genre;
		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
		this.language = language;
		this.description = description;
		this.showTimings = showTimings;
		this.enabled = enabled;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Integer getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShowTimings() {
		return showTimings;
	}

	public void setShowTimings(String showTimings) {
		this.showTimings = showTimings;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", genre=" + genre + ", movieName=" + movieName + ", ticketPrice="
				+ ticketPrice + ", language=" + language + ", description=" + description + ", showTimings="
				+ showTimings + ", enabled=" + enabled + "]";
	}

	
}
