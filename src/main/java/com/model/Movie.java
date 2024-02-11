package com.model;

import com.enums.Genre;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movieId;
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Genre genre;
	private String movieName;
	private Integer ticketPrice;
	private String language;
	private String description;
	private String showTimings;
	private boolean enabled;
	private String image;
	
	public Movie() {
		super();
		// constructor without the movie id
	}

	public Movie(Integer movieId, Genre genre, String movieName, Integer ticketPrice, String language,
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
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", genre=" + genre + ", movieName=" + movieName + ", ticketPrice="
				+ ticketPrice + ", language=" + language + ", description=" + description + ", showTimings="
				+ showTimings + ", enabled=" + enabled + ", image=" +image +"]";
	}

	
}
