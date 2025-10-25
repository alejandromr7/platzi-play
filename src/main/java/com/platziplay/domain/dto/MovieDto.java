package com.platziplay.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MovieDto {
    String title;
    Integer duration;
    String genre;
    LocalDate releaseDate;
    Double rating;


}
