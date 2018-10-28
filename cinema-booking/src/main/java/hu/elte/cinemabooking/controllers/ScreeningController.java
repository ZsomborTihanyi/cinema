package hu.elte.cinemabooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.elte.cinemabooking.entities.Screening;
import hu.elte.cinemabooking.repositories.ScreeningRepository;

@RestController
@RequestMapping("/screenings")
public class ScreeningController {

	@Autowired
	private ScreeningRepository screeningRepository;
	
	@GetMapping("")
	public ResponseEntity<Iterable<Screening>> getAll() {
		return ResponseEntity.ok(screeningRepository.findAll());
	}
	
}
