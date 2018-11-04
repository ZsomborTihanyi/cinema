package hu.elte.cinemabooking.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@Secured({"ROLE_ADMIN"})
	@PostMapping("")
	public ResponseEntity<Hall> post(@RequestBody Hall hall) {
		return ResponseEntity.ok(hallRepository.save(hall));
	}
	
	@Secured({"ROLE_ADMIN"})
	@PutMapping("/{id}")
	public ResponseEntity<Hall> update(@PathVariable Integer id, @RequestBody Hall hall) {
		Optional<Hall> oHall = hallRepository.findById(id);
		if(oHall.isPresent()) {
			hall.setHallId(id);;
			return ResponseEntity.ok(hallRepository.save(hall));
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@Secured({"ROLE_ADMIN"})
	@DeleteMapping("{/id}")
	public ResponseEntity<Hall> delete(@PathVariable Integer id) {
		Optional<Hall> oHall = hallRepository.findById(id);
		if(oHall.isPresent()) {
			hallRepository.deleteById(id);
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
