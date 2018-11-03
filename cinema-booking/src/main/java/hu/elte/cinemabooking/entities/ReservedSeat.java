package hu.elte.cinemabooking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class ReservedSeat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reservedSeatId;
	
	@Column(name = "COLUMN")
	@NotNull
	private Character column;
	
	@Column(name = "ROW")
	@NotNull
	private Integer row;
	
	@ManyToOne
	@JoinColumn(name = "BOOKING_ID")
	@JsonIgnore
	private Booking booking;
	
	@ManyToOne
	@JoinColumn(name = "HALL_ID")
	@JsonIgnoreProperties({"hallId", "numberOfRows", "numberOfColumns"})
	private Hall hall;
	
}
