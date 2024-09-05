package org.example.model.entities;

import lombok.*;
import org.example.model.enums.Estado;
import org.example.model.enums.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
@ToString(exclude = {"detalles", "estado", "tipoEnvio"})
public class Pedido {

    //
    private Long id;
    private LocalDate fechaPedido;
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private Set<DetallePedido> detalles = new HashSet<>();
}
