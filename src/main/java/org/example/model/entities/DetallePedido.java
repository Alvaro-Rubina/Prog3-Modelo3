package org.example.model.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
@ToString(exclude = "articulo")
public class DetallePedido {

    //
    private Long id;
    private int cantidad;
    private double subTotal;
    private Articulo articulo;

    //
    public DetallePedido(Articulo articulo, int cantidad){
        this.cantidad = cantidad;
        this.articulo = articulo;
        this.subTotal = (articulo.getPrecioVenta() * cantidad);
    }

}
