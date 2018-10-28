package hu.elte.cinemabooking.repositories;

import hu.elte.cinemabooking.entities.Screening;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreeningRepository extends CrudRepository<Screening, Integer>{
	
}
