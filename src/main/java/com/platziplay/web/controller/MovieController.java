package com.platziplay.web.controller;

import com.platziplay.domain.dto.MovieDto;
import com.platziplay.domain.service.MovieService;
import com.platziplay.persistence.crud.CrudMovieEntity;
import com.platziplay.persistence.entity.MovieEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/movies")
    public List<MovieDto> getAllMovies() {
        return this.movieService.getAllMovies();
    }


}
