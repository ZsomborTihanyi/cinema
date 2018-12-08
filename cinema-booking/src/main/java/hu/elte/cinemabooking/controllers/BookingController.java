package hu.elte.cinemabooking.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import hu.elte.cinemabooking.entities.Booking;
import hu.elte.cinemabooking.entities.ReservedSeat;
import hu.elte.cinemabooking.entities.User;
import hu.elte.cinemabooking.repositories.BookingRepository;
import hu.elte.cinemabooking.repositories.ReservedSeatRepository;
import hu.elte.cinemabooking.security.AuthenticatedUser;

@CrossOrigin
@Secured({"ROLE_ADMIN","ROLE_USER"})
@RestController
@RequestMapping("/bookings")
public class BookingController {
    
    @Autowired
    private BookingRepository bookingRepository;
    
    @Autowired
    private ReservedSeatRepository reservedSeatRepository;
    
    @Autowired
    private AuthenticatedUser authenticatedUser;
    
    @GetMapping("")
	public ResponseEntity<Iterable<Booking>> getAll() {
    	User user = authenticatedUser.getUser();
    	User.Role role = user.getRole();
    	
    	if(role.equals(User.Role.ROLE_ADMIN)) {
    		return ResponseEntity.ok(bookingRepository.findAll());
    	} else {
    		return ResponseEntity.ok(bookingRepository.findAllByUser(user));
    	}
	}
    
    @GetMapping("/{id}")
    public ResponseEntity<Booking> get(@PathVariable Integer id) {
    	Optional<Booking> booking = bookingRepository.findById(id);
    	User user = authenticatedUser.getUser();
    	User.Role role = user.getRole();
    	
    	if(booking.isPresent() &&
    			(user.getUsername().equals(booking.get().getUser().getUsername()) ||
    					role.equals(User.Role.ROLE_ADMIN))) {
    		return ResponseEntity.ok(booking.get());
    	} else {
    		return ResponseEntity.notFound().build();
    	}
    }
    
    @PostMapping("")
    public ResponseEntity<Booking> post(@RequestBody Booking booking) {
    	User user = authenticatedUser.getUser();
    	booking.setUser(user);
    	Booking savedBooking = bookingRepository.save(booking);
    	return ResponseEntity.ok(savedBooking);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Booking> delete(@PathVariable Integer id) {
    	Optional<Booking> oBooking = bookingRepository.findById(id);
    	User user = authenticatedUser.getUser();
    	User.Role role = user.getRole();
    	
    	if(oBooking.isPresent() &&
    			(user.getUsername().equals(oBooking.get().getUser().getUsername()) ||
    					role.equals(User.Role.ROLE_ADMIN))) {
    		bookingRepository.deleteById(id);
    		return ResponseEntity.ok().build();
    	} else {
    		return ResponseEntity.notFound().build();
    	}
    }
    
    @GetMapping("/{id}/reservedseats")
    public ResponseEntity<Iterable<ReservedSeat>> seats(@PathVariable Integer id) {
    	Optional<Booking> oBooking = bookingRepository.findById(id);
    	User user = authenticatedUser.getUser();
    	User.Role role = user.getRole();
    	
    	if(oBooking.isPresent() &&
    			(user.getUsername().equals(oBooking.get().getUser().getUsername()) ||
    					role.equals(User.Role.ROLE_ADMIN))) {
    		return ResponseEntity.ok(oBooking.get().getReservedSeats());
    	} else {
    		return ResponseEntity.notFound().build();
    	}
    }
    
    @PostMapping("/{id}/reservedseats")
    public ResponseEntity<ReservedSeat> insertSeats(@PathVariable Integer id, @RequestBody ReservedSeat reservedseat) {
    	Optional<Booking> oBooking = bookingRepository.findById(id);
    	User user = authenticatedUser.getUser();
    	
    	if(oBooking.isPresent() &&
    			user.getUsername().equals(oBooking.get().getUser().getUsername())) {
    		Booking booking = oBooking.get();
    		reservedseat.setBooking(booking);
    		return ResponseEntity.ok(reservedSeatRepository.save(reservedseat));
    	} else {
    		return ResponseEntity.notFound().build();
    	}
    }
    
    
    
}
