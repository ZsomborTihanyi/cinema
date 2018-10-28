package hu.elte.cinemabooking.repositories;

import hu.elte.cinemabooking.entities.Hall;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends CrudRepository<Hall, Integer> {

}
