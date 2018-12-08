package hu.elte.cinemabooking.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import hu.elte.cinemabooking.entities.Movie;
import hu.elte.cinemabooking.entities.User;
import hu.elte.cinemabooking.repositories.UserRepository;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    @Autowired
    private UserRepository userRepository;

    @PostMapping("register")
    public ResponseEntity<User> register(@RequestBody User user) {
        Optional<User> oUser = userRepository.findByUsername(user.getUsername());
        if (oUser.isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(true);
        user.setRole(User.Role.ROLE_USER);
        return ResponseEntity.ok(userRepository.save(user));
    }

    @PostMapping("login")
    public ResponseEntity login(@RequestBody User user) {
        return ResponseEntity.ok().build();
    }
    
    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    @GetMapping("")
	public ResponseEntity<Iterable<User>> getAll() {
		return ResponseEntity.ok(userRepository.findAll());
	}
    
    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    @GetMapping("{/id}/movies")
    public ResponseEntity<Iterable<Movie>> movies(@PathVariable Long id) {
    	Optional<User> oUser = userRepository.findById(id);
    	if(oUser.isPresent()) {
    		return ResponseEntity.ok(oUser.get().getMovies());
    	} else {
    		return ResponseEntity.notFound().build();
    	}
    }
}
