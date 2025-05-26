package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class tipo_vinculacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //ATRIBUTOS

    private Long id_tipo_vinculacion;
    private String vinculacion;

}
