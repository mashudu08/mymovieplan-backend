package com.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="userId", referencedColumnName = "userId")
	
	private User user;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="movieId", referencedColumnName = "movieId")
	
	private Movie movie;
	
	private Integer quantity;
	private String paymentStatus;
	private LocalDateTime bookingDate;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(Integer bookingId, User user, Movie movie, Integer quantity, String paymentStatus,
			LocalDateTime bookingDate) {
		super();
		this.bookingId = bookingId;
		this.user = user;
		this.movie = movie;
		this.quantity = quantity;
		this.paymentStatus = paymentStatus;
		this.bookingDate = bookingDate;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", user=" + user + ", movie=" + movie + ", quantity=" + quantity
				+ ", paymentStatus=" + paymentStatus + ", bookingDate=" + bookingDate + "]";
	}
}
