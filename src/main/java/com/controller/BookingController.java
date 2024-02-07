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
//import com.service.UserService;

@RestController
@RequestMapping("/bookings")
@CrossOrigin(origins = {"http://localhost:4200"})
public class BookingController {
	@Autowired
	private BookingService bs;

//	@Autowired
//	private UserService userService;
	
	// book a movie
	@PostMapping("/add-booking")
	public Booking addBookingToCart(@RequestBody Booking booking) 
	{
		return bs.create(booking);
	}
	  
	// view all bookings
	  @GetMapping("/get-bookings")
	  public List<Booking> retrieveAllBookings() 
	  {
		  return bs.read();
	  }
	  
	  // view booking by id
	  @GetMapping("/booking/{id}")
	 public Booking findBookingById(@PathVariable("id") Integer id)
	  {
		  return bs.read(id);
	  }
	  
	 
	  // update booking
	  @PutMapping("/update-booking")
	 public Booking updateBooking(@RequestBody Booking booking) 
	 {
		  return bs.update(booking);
	 }
	 
	  // delete/cancel booking
		@DeleteMapping("/booking/{id}")
		public Booking removeBooking(@PathVariable("id") Integer id) {
			return bs.delete(id);
		}
}
