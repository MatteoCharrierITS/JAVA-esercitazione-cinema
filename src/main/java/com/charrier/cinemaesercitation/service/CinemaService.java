package com.charrier.cinemaesercitation.service;

import com.charrier.cinemaesercitation.model.Movie;
import com.charrier.cinemaesercitation.repository.CinemaRepository;
import com.charrier.cinemaesercitation.repository.MovieRepository;
import com.charrier.cinemaesercitation.repository.MovieRoomRepository;
import com.charrier.cinemaesercitation.repository.ReservationsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CinemaService {

    private final CinemaRepository cinemaRepository;
    private final MovieRepository movieRepository;
    private final MovieRoomRepository movieRoomRepository;
    private final ReservationsRepository reservationsRepository;

    public List<Movie> getAllMovies () {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(int id) {
        return movieRepository.findById(id);
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

}
