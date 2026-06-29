package com.charrier.cinemaesercitation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "movie_room")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MovieRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @OneToOne
    @JoinColumn(name = "film_id")
    private Movie movie;

    @Column
    private LocalDateTime date;

    @Column
    private Double price;

    @Column(name = "remaining_seats")
    private Integer remainingSeats;

}
