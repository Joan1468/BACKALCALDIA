package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Asignacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsignacion; // Usar camelCase es una buena práctica

    private String prueba; // También usar camelCase para este campo

    // Relaciones

    @OneToOne
    @JoinColumn(name = "id_equipo") // LO QUE VA A BUSCAR
    private Equipo equipo;// DONDE LO VA A BUSCAR

    @ManyToOne
    @JoinColumn(name = "id_usuario") // LO QUE VA A BUSCAR
    private usuario usuario;// DONDE LO VA A BUSCAR
}
