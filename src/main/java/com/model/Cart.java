package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartId;
	private Integer userId;
	private Integer movieId;
	private Integer quantity;
	
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(Integer cartId, Integer userId, Integer movieId, Integer quantity) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.movieId = movieId;
		this.quantity = quantity;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
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

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", movieId=" + movieId + ", quantity=" + quantity
				+ "]";
	}
	
	
	
}
