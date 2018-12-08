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
import org.springframework.web.bind.annotation.CrossOrigin;

import hu.elte.cinemabooking.entities.Movie;
import hu.elte.cinemabooking.repositories.MovieRepository;

@CrossOrigin
@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@GetMapping("")
	public ResponseEntity<Iterable<Movie>> getAll() {
		return ResponseEntity.ok(movieRepository.findAll());
	}
	
	@Secured({"ROLE_ADMIN"})
	@PostMapping("")
	public ResponseEntity<Movie> post(@RequestBody Movie movie) {
		return ResponseEntity.ok(movieRepository.save(movie));
	}
	
	@Secured({"ROLE_ADMIN"})
	@PutMapping("/{id}")
	public ResponseEntity<Movie> update(@PathVariable Integer id, @RequestBody Movie movie) {
		Optional<Movie> oMovie = movieRepository.findById(id);
		if(oMovie.isPresent()) {
			movie.setMovieId(id);;
			return ResponseEntity.ok(movieRepository.save(movie));
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@Secured({"ROLE_ADMIN"})
	@DeleteMapping("{/id}")
	public ResponseEntity<Movie> delete(@PathVariable Integer id) {
		Optional<Movie> oMovie = movieRepository.findById(id);
		if(oMovie.isPresent()) {
			movieRepository.deleteById(id);
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
