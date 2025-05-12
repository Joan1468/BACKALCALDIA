package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //ATRIBUTOS

    private Long id_Inventario;
    private String Serial;
    private LocalDate fechaAdquisicion;

//RELACIONES

    // INVENTARIO CON EQUIPO
    @OneToMany//UN INVENTARIO PARA MUCHOS EQUIPOS
    @JoinColumn(name = "id_Equipo")// LO QUE VA A BUSCAR
    private Equipo equipo;//DONDE LO VA A BUSCAR

}
