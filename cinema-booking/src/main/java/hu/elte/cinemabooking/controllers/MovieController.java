package hu.elte.cinemabooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.elte.cinemabooking.entities.Movie;
import hu.elte.cinemabooking.repositories.MovieRepository;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@GetMapping("")
	public ResponseEntity<Iterable<Movie>> getAll() {
		return ResponseEntity.ok(movieRepository.findAll());
	}
}
