package hu.elte.cinemabooking.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Hall {

	@Id
	@Column(name = "HALL_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hallId;
	
	@Column(name = "HALL_NAME")
	@NotNull
	private String hallName;
	
	@Column(name = "NUMBER_OF_ROWS")
	@NotNull
	private Integer numberOfRows;
	
	@Column(name = "NUMBER_OF_COLUMNS")
	@NotNull
	private Integer numberOfColumns;
	
	@OneToMany(mappedBy = "hall")
	@JsonIgnore
	private List<Screening> screenings;
	
	@OneToMany(mappedBy = "hall")
	@JsonIgnore
	private List<ReservedSeat> reservedSeats;
}
