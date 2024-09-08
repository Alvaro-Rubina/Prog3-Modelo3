package org.example.Entidades;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder

public class Pedido {
    private Long id;
    private LocalTime horaEstimadaFInalizacion;
    private Double total;
    private Double totalCosto;
    private Estado Estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate FechaPedido;
    private Set<DetallePedido> detalles= new HashSet<>() ;


}
