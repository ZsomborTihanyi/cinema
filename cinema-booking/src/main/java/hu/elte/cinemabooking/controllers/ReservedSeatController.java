package hu.elte.cinemabooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import hu.elte.cinemabooking.entities.ReservedSeat;
import hu.elte.cinemabooking.repositories.ReservedSeatRepository;

@CrossOrigin
@Secured({"ROLE_ADMIN"})
@RestController
@RequestMapping("/reservedseats")
public class ReservedSeatController {
	
	@Autowired
	private ReservedSeatRepository reservedSeatRepository;
	
	@GetMapping("")
	public ResponseEntity<Iterable<ReservedSeat>> getAll() {
		return ResponseEntity.ok(reservedSeatRepository.findAll());
	}
}
