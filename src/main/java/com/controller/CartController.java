package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Cart;
import com.service.CartService;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = { "http://localhost:4200" })
public class CartController {

	@Autowired
	private CartService cartService;

	//view cart items
	@GetMapping("/view-cart")
	public List<Cart> cartItems() {
		return cartService.read();
	}

	// view booking by id
//	  @GetMapping("/cart/{id}")
//	 public Cart findCartItemById(@PathVariable("id") Integer id)
//	  {
//		  return cartService.read(id);
//	  }

	// update cart
	@PutMapping("/update-cart")
	public Cart updateCart(@RequestBody Cart cart) {
		return cartService.update(cart);
	}

	// delete item in cart
	@DeleteMapping("/cart/{id}")
	public Cart removeCartItem(@PathVariable("id") Integer id) {
		return cartService.delete(id);
	}
}
