package com.platziplay.domain.service;

import com.platziplay.domain.dto.MovieDto;
import com.platziplay.domain.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDto> getAllMovies() {
        return movieRepository.getAll();
    }


}
