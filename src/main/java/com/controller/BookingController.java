package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Booking;
import com.service.BookingService;
import com.service.UserService;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = {"http://localhost:4200"})
public class BookingController {
	@Autowired
	private BookingService bs;

	@Autowired
	private UserService us;
	
	  @GetMapping("/movies")
	  public List<Booking> retrieveAllBookings() 
	  {
		  return bs.read();
	  }
	  
	  @GetMapping("/movies/{id}")
	 public Booking findBookingById(@PathVariable("id") Integer id)
	  {
		  return bs.read(id);
	  }
	  
	  //TODO: fetch movies by category
	 
	  @PostMapping("/")
	 public Booking addBookingToCart(@RequestBody Booking booking) 
	 {
		  return bs.create(booking);
	 }
	 
	  @PutMapping
	 public Booking updateBooking(@RequestBody Booking booking) 
	 {
		  return bs.update(booking);
	 }
	 
	  @DeleteMapping("/{id}")
	 public Booking removeBooking(@PathVariable("id") Integer id)
	  {
		  return bs.delete(id);
	 }
}
