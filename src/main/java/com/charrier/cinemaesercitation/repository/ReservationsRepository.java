package com.charrier.cinemaesercitation.repository;

import com.charrier.cinemaesercitation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationsRepository extends JpaRepository<Reservation, Integer> {
}
