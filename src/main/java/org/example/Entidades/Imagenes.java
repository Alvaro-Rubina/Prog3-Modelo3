package org.example.Entidades;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Imagenes {
    private Long id;
    private String nombre;
    private String url;
}

