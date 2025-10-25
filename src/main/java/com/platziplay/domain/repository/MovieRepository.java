package com.platziplay.domain.repository;

import com.platziplay.domain.dto.MovieDto;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();
}