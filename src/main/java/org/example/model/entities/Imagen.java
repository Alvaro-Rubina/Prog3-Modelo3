package org.example.model.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
@ToString
public class Imagen {

    //
    private Long id;
    private String nombre;
    private String url;

}
