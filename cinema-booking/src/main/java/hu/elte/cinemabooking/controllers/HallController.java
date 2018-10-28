package hu.elte.cinemabooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.elte.cinemabooking.entities.Hall;
import hu.elte.cinemabooking.repositories.HallRepository;

@RestController
@RequestMapping("/halls")
public class HallController {
	
	@Autowired
	private HallRepository hallRepository;
	
	@GetMapping("")
	public ResponseEntity<Iterable<Hall>> getAll() {
		return ResponseEntity.ok(hallRepository.findAll());
	}

}
