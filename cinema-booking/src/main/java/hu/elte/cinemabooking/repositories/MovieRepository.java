package hu.elte.cinemabooking.repositories;

import hu.elte.cinemabooking.entities.Movie;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
