package hu.elte.cinemabooking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class ReservedSeat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookedSeatId;
	
	@Column(name = "COLUMN")
	@NotNull
	private Character column;
	
	@Column(name = "ROW")
	@NotNull
	private Integer row;
}
