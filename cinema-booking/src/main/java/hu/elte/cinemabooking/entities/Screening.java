package hu.elte.cinemabooking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

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
	@Column(name = "screening_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "movie_name_id")
	@NotNull
	private String movieNameId;
	
	@Column(name = "hall_name_id")
	@NotNull
	private String hallNameId;
	
	@Column(name = "screening_time")
	@NotNull
	private String screeningTime;
}
