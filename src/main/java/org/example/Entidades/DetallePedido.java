package org.example.Entidades;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class DetallePedido {
    private Long id;
    private Integer cantidad;
    private Double subTotal;
    private  Articulo articulo;
}
