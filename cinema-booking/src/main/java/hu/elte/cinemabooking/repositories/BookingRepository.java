package hu.elte.cinemabooking.repositories;

import hu.elte.cinemabooking.entities.Booking;
import hu.elte.cinemabooking.entities.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer>{

	public Iterable<Booking> findAllByUser(User user);
    
}
