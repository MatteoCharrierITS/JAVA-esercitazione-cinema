package com.charrier.cinemaesercitation.repository;

import com.charrier.cinemaesercitation.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
