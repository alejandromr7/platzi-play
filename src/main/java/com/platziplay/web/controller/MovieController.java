package com.platziplay.web.controller;

import com.platziplay.persistence.crud.CrudMovieEntity;
import com.platziplay.persistence.entity.MovieEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    private final CrudMovieEntity crudMovieEntity;

    public MovieController(CrudMovieEntity crudMovieEntity) {
        this.crudMovieEntity = crudMovieEntity;
    }

    @GetMapping("/movies")
    public List<MovieEntity> getAllMovies() {
        return (List<MovieEntity>) this.crudMovieEntity.obtenerPeliculas();
    }

    @GetMapping("/total")
    public ResponseEntity<?> getMoviesTotal() {
        return ResponseEntity.ok(this.crudMovieEntity.obtenerPeliculasCount());
    }
}
