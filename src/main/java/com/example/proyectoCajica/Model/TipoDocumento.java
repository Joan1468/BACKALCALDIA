package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tipo_documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //ATRIBUTOS

    private Long id_tipo_documento;//ID DE TIPO DE DOCUMENTO
    private String nombre;// cedula


    //RELACIONES

    //TIPO DE DOCUMENTO CON USUARIO
    // UN TIPO DE DOCUMENTO PARA MUCHOS USUARIOS
    @OneToMany(mappedBy = "tipo_documento", cascade = CascadeType.ALL)// LO QUE VA A BUSCAR
    private List<Usuario> usuario;//DONDE LO VA A BUSCAR

}
