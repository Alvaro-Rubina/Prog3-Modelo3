package org.example.Entidades;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Cliente {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private LocalDate fechaNacimiento;
    private Set<Pedido> hace = new HashSet<>();
}

