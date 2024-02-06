package com.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingId;
	private Integer userId;
	private Integer movieId;
	private Integer quantity;
	private String paymentStatus;
	private LocalDateTime bookingDate;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(Integer bookingId, Integer userId, Integer movieId, Integer quantity, String paymentStatus,
			LocalDateTime bookingDate) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.movieId = movieId;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
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
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", movieId=" + movieId + ", quantity="
				+ quantity + ", paymentStatus=" + paymentStatus + ", bookingDate=" + bookingDate + "]";
	}
	
	
}
