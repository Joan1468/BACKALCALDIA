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
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_Estado;
private String Bueno;
private String Regular;
private String Malo;

//RELACIONES

//ESTADO CON EQUIPO  UN SOLO ESTAD PARA MUCHOS EQUIPOS
@OneToMany(mappedBy = "Estado", cascade = CascadeType.ALL, orphanRemoval = true)// LO QUE VA A BUSCAR
private List<Equipo> equipo;//DONDE LO VA A BUSCAR

}
