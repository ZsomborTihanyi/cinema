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
public class Hall {

	@Id
	@Column(name = "hall_name_id")
	private String hallNameId;
	
	@Column(name = "number_of_rows")
	@NotNull
	private Integer numberOfRows;
	
	@Column(name = "number_of_columns")
	@NotNull
	private Integer numberOfColumns;
	
	
}
