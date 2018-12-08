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

import hu.elte.cinemabooking.entities.Screening;
import hu.elte.cinemabooking.repositories.ScreeningRepository;

@CrossOrigin
@RestController
@RequestMapping("/screenings")
public class ScreeningController {

	@Autowired
	private ScreeningRepository screeningRepository;
	
	@GetMapping("")
	public ResponseEntity<Iterable<Screening>> getAll() {
		return ResponseEntity.ok(screeningRepository.findAll());
	}
	
	@Secured({"ROLE_ADMIN"})
	@PostMapping("")
	public ResponseEntity<Screening> post(@RequestBody Screening screening) {
		return ResponseEntity.ok(screeningRepository.save(screening));
	}
	
	@Secured({"ROLE_ADMIN"})
	@PutMapping("/{id}")
	public ResponseEntity<Screening> update(@PathVariable Integer id, @RequestBody Screening screening) {
		Optional<Screening> oScreening = screeningRepository.findById(id);
		if(oScreening.isPresent()) {
			screening.setId(id);
			return ResponseEntity.ok(screeningRepository.save(screening));
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@Secured({"ROLE_ADMIN"})
	@DeleteMapping("{/id}")
	public ResponseEntity<Screening> delete(@PathVariable Integer id) {
		Optional<Screening> oScreening = screeningRepository.findById(id);
		if(oScreening.isPresent()) {
			screeningRepository.deleteById(id);
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
