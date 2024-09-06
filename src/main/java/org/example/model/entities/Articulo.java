package org.example.model.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
@ToString(exclude = {"unidadMedida", "imagen"})
public class Articulo {

    //
    private Long id;
    private String denominacion;
    private double precioVenta;
    private double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private int tiempoEstimadoEnMinutos;
    private UnidadMedida unidadMedida;
    private Imagen imagen;
}
