package hu.elte.cinemabooking.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
    
    @OneToOne
    @JoinColumn(name = "USER_ID")
    @JsonIgnoreProperties({"userId","password","enabled","role","movies"})
    private User user;

    @Column(name = "NUMBER_OF_SEATS")
    @NotNull
    private Integer numberOfSeats;
    
    @Column(name = "PRICE")
    @NotNull
    private Integer price;
    
    @Column(name = "PAYMENT_METHOD")
    @NotNull
    private String paymentMethod;
    
    @OneToMany(mappedBy = "booking")
    @JsonIgnoreProperties({"reservedSeatId"})
    private List<ReservedSeat> reservedSeats;
    
    @ManyToOne
    @JoinColumn(name = "SCREENING_ID")
    @JsonIgnoreProperties({"id"})
    private Screening screening;
    
    
}
