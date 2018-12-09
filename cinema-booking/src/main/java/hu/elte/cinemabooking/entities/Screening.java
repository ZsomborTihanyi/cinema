package hu.elte.cinemabooking.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Screening {
	
	@Id
	@Column(name = "SCREENING_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "SCREENING_TIME")
	@NotNull
	private String screeningTime;
	
	@ManyToOne
	@JoinColumn(name = "HALL_ID")
	@JsonIgnoreProperties({"hallId","numberOfRows", "numberOfColumns"})
	private Hall hall;
	
	@OneToMany(mappedBy = "screening")
	@JsonIgnore
	private List<Booking> bookings;
	
	@ManyToOne
	@JoinColumn(name = "MOVIE_ID")
	@JsonIgnoreProperties({"movieId","description"})
	private Movie movie;
}
