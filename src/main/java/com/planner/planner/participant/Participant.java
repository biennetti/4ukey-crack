package com.planner.planner.participant;


import com.planner.planner.trip.Trip;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;



import java.util.UUID;

@Entity
@Table(name = "participants")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Participant {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "is_confirmed", nullable = false)
    private Boolean isConfirmed;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "trip_id", nullable = false)
    private Trip trip;

    public Participant(String email, Trip trip) {
        this.email = email;
        this.trip = trip;
        this.isConfirmed = false;
        this.name = "";
    }

}
