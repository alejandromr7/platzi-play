package com.platziplay.persistence.crud;

import com.platziplay.persistence.entity.MovieEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {

    @Query(value = "SELECT *\n" +
            "FROM platzi_play_peliculas\n" +
            "LIMIT 10;", nativeQuery = true)
    List<MovieEntity> obtenerPeliculas();

    @Query(value = "SELECT COUNT(*) FROM platzi_play_peliculas", nativeQuery = true)
    Integer obtenerPeliculasCount();
}