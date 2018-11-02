package hu.elte.cinemabooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.elte.cinemabooking.entities.Booking;
import hu.elte.cinemabooking.repositories.BookingRepository;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    
    @Autowired
    private BookingRepository bookingRepository;
    
    @GetMapping("")
	public ResponseEntity<Iterable<Booking>> getAll() {
		return ResponseEntity.ok(bookingRepository.findAll());
	}
}
