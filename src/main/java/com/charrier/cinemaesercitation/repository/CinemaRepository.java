package com.charrier.cinemaesercitation.repository;

import com.charrier.cinemaesercitation.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, Integer> {
}
