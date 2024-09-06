package org.example.model.entities;

import lombok.*;
import org.example.model.enums.Estado;
import org.example.model.enums.MetodoPago;
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
    private MetodoPago formaPago;
    private Set<DetallePedido> detalles = new HashSet<>();

    //
    public Pedido(HashSet<DetallePedido> detalles, TipoEnvio tipoEnvio, MetodoPago formaPago){
        this.detalles = detalles;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.estado = Estado.EN_PREPARACION;
        this.fechaPedido = LocalDate.now();
        this.horaEstimadaFinalizacion = setHoraEstimadaFinalizacion();
        this.total = setTotal();
        this.totalCosto = setTotalCosto();
    }

    //
    private double setTotal() {
        double valorTotal = 0;
        for (DetallePedido detallePedido: detalles){
            valorTotal += detallePedido.getSubTotal();
        }
        return valorTotal;
    }

    private double setTotalCosto(){
        double valorCostoTotal = 0;
        for (DetallePedido detallePedido: detalles){
            valorCostoTotal += detallePedido.getArticulo().getPrecioCompra() * detallePedido.getCantidad();
        }
        return valorCostoTotal;
    }

    /*La hora estimada de finalizacion se determina de la siguiente forma:
        Tiempo de preparacion del artículo que más demore + 15 minutos en caso de que haya más
        de 3 articulos con tiempo de preparacion mayor a 0*/
    private LocalTime setHoraEstimadaFinalizacion() {
        int tiempoMaximo = 0;
        int cantidadProductosConTiempoMayorACero = 0;

       for (DetallePedido detallePedido: detalles){
           if (detallePedido.getArticulo().getTiempoEstimadoEnMinutos() > tiempoMaximo ){
               tiempoMaximo = detallePedido.getArticulo().getTiempoEstimadoEnMinutos();
           }

           if (detallePedido.getArticulo().getTiempoEstimadoEnMinutos() > 0){
               cantidadProductosConTiempoMayorACero++;
           }
       }

       if (cantidadProductosConTiempoMayorACero > 3){
           tiempoMaximo += 15;
       }

       return LocalTime.now().plusMinutes(tiempoMaximo);
    }
}
