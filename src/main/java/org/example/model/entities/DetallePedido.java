package org.example.model.entities;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
@ToString(exclude = "articulos")
public class DetallePedido {

    //
    private Long id;
    private int cantidad;
    private double subTotal;
    private Set<Articulo> articulos = new HashSet<>();

}
