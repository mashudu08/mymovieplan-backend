package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movieId;
	private String movieName;
	private Integer ticketPrice;
	private String langauge;
	private String description;
	private String showTimings;
	private boolean enabled;
	
	public Movie() {
		super();
		// constructor without the movie id
	}

	public Movie(Integer movieId, String movieName, Integer ticketPrice, String langauge, String description,
			String showTimings, boolean enabled) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
		this.langauge = langauge;
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

	public String getLangauge() {
		return langauge;
	}

	public void setLangauge(String langauge) {
		this.langauge = langauge;
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
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", ticketPrice=" + ticketPrice + ", langauge="
				+ langauge + ", description=" + description + ", showTimings=" + showTimings + ", enabled=" + enabled
				+ "]";
	}
	

}
