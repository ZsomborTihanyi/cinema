package hu.elte.cinemabooking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class Booking {
    @Id
    @Column(name = "BOOKING_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    /* //ez nem biztos
    @ManyToOne
    @JoinColumn(name = "USERNAME_ID")
    private User userNameId;
    
    @ManyToOne
    @JoinColumn(name = "HALL_NAME_ID")
    private Hall hallNameID;
    */
    
    @Column(name = "SCREENING_TIME")
    @NotNull
    private Integer screeningTime;
    
    @Column(name = "NUMBER_OF_SEATS")
    @NotNull
    private Integer numberOfSeats;
    
    @Column(name = "PRICE")
    @NotNull
    private Integer price;
    
    @Column(name = "PAYMENT_METHOD")
    @NotNull
    private String paymentMethod;
}
