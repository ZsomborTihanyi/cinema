package hu.elte.cinemabooking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Movie {
	
	@Id
	@Column(name = "movie_id")
	private String movieNameId;
	
	@Column
	@NotNull
	private String genre;
	
	@Column
	@NotNull
	private String runtime;
	
	@Column
	private String description;
	
	
}
