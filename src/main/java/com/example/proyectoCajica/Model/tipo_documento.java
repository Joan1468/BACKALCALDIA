package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class tipo_documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //ATRIBUTOS

    private Long id_tipo_documento;//ID DE TIPO DE DOCUMENTO
    private String nombre;// cedula


}
