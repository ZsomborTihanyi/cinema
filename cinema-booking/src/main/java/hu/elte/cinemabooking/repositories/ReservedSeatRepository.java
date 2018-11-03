package hu.elte.cinemabooking.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.elte.cinemabooking.entities.ReservedSeat;

@Repository
public interface ReservedSeatRepository extends CrudRepository<ReservedSeat, Integer>{

}
