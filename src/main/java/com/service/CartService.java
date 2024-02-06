package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Cart;

import com.repository.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cr;
	
	//create
	public Cart create(Cart cart) {
		return cr.save(cart);
	}
	
	//read all
	public List<Cart> read(){
		return cr.findAll();
	}
	
	// read by id
//	public Cart read1(Integer id) {
//		Optional<Cart> temp = cr.findById(id);
//		Cart cart = null;
//		if(temp.isPresent())
//		{
//			cart = temp.get();
//		}
//		return cart;
//	}
	
	//delete
	public Cart delete(Integer id) {
		Optional<Cart> temp = cr.findById(id);  
		Cart cart = null;
		if(temp.isPresent())
		{
			cart = temp.get();
			cr.delete(cart);
		}
			return cart;
		
	}
}
