package com.platziplay.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "platzi_play_peliculas", schema = "public")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;
    @Column(name = "duracion")
    private Integer duracion;
    @Column(name = "genero")
    private String genero;
    @Column(name = "clasificacion")
    private String clasificacion;
    @Column(name = "fecha_estreno")
    private LocalDate fechaEstreno;
    @Column(name = "estado")
    private String estado;

}