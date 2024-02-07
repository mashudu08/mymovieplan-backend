package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Booking;
import com.repository.BookingRepository;

@Service
public class BookingService {
	@Autowired
	private BookingRepository br;

	// create
	public Booking create(Booking booking) {
		return br.save(booking);
	}

	// read all
	public List<Booking> read() {
		return br.findAll();
	}

	// read by id
	public Booking read(Integer id) {
		Optional<Booking> temp = br.findById(id);
		Booking booking = null;
		if (temp.isPresent()) {
			booking = temp.get();
		}
		return booking;
	}

	// update
	public Booking update(Booking booking) {
		Optional<Booking> temp = br.findById(booking.getBookingId());
		if (temp.isPresent()) {
			br.save(booking);
			return booking;
		}
		return null;

	}

	// delete/cancel booking
	public Booking delete(Integer id) {
		Optional<Booking> temp = br.findById(id);
		Booking booking = null;
		if (temp.isPresent()) {
			booking = temp.get();
			br.delete(booking);
		}
		return booking;

	}
}
