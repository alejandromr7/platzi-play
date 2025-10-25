package com.platziplay.persistence;

import com.platziplay.domain.dto.MovieDto;
import com.platziplay.domain.repository.MovieRepository;
import com.platziplay.persistence.crud.CrudMovieEntity;
import com.platziplay.persistence.mapper.MovieMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class MovieEntityRepository implements MovieRepository {
    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper) {
        this.crudMovieEntity = crudMovieEntity;
        this.movieMapper = movieMapper;
    }

    @Override
    public List<MovieDto> getAll() {
        return this.movieMapper.toDto(this.crudMovieEntity.findAll());
    }
}
