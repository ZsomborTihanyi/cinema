package hu.elte.cinemabooking.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
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
public class Hall {

	@Id
	@Column(name = "HALL_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "HALL_NAME")
	@NotNull
	private String hallNameId;
	
	@Column(name = "NUMBER_OF_ROWS")
	@NotNull
	private Integer numberOfRows;
	
	@Column(name = "NUMBER_OF_COLUMNS")
	@NotNull
	private Integer numberOfColumns;
	
	@OneToMany
	@JoinTable
	(
			name="SCREENING_TIMES",
		    joinColumns={ @JoinColumn(name="HALL_ID", referencedColumnName="HALL_ID") },
		    inverseJoinColumns={ @JoinColumn(name="SCREENING_ID", referencedColumnName="SCREENING_ID", unique=true) }
	)
	private List<Screening> screenings;
	
	
}
