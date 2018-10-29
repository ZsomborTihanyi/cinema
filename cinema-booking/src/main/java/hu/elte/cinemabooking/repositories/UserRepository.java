package hu.elte.cinemabooking.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import hu.elte.cinemabooking.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
