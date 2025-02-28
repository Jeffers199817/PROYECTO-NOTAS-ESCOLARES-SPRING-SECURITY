package com.milenyumsoft.notasescolares.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Nota {

    private Long idCalificacion;
    private String nombreMateria;
    private double calificacionMateria;
}
