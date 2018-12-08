package hu.elte.cinemabooking.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class Movie {
	
	@Id
	@Column(name = "MOVIE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer movieId;
	
	@Column(name = "MOVIE_NAME")
	@NotNull
	private String movieName;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	@NotNull
	private Genre genre;
	
	@Column
	@NotNull
	private String runtime;
	
	@Column
	private String description;
	
	@OneToMany(mappedBy = "movie")
	@JsonIgnore
	private List<Screening> screenings;
	
	@ManyToMany(mappedBy = "movies")
	@JsonIgnore
	private List<User> users;
	
	public enum Genre {
        SCI_FI, COMEDY, ANIMATION
    }
}
