package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "secretarias")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class secretarias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_secretaria;
    private String nombre;


}