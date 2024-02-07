package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="userId", referencedColumnName = "userId")
	private User user;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="bookingId", referencedColumnName = "bookingId")
	private Booking booking;
//	private Integer movieId;
	private Integer quantity;
	
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cart(Integer cartId, User user, Booking booking, Integer quantity) {
		super();
		this.cartId = cartId;
		this.user = user;
		this.booking = booking;
		this.quantity = quantity;
	}


	public Integer getCartId() {
		return cartId;
	}


	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Booking getBooking() {
		return booking;
	}


	public void setBooking(Booking booking) {
		this.booking = booking;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", user=" + user + ", booking=" + booking + ", quantity=" + quantity + "]";
	}

}
