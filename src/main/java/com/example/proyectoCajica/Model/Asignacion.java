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

    //ATRIBUTOS

    private int id_Asignacion;  //IDENTIFIACION DE ASIGNACION
    private String Prueba;      //aval de que el equipo esta  preparado para usarse

//RELACIONES

    //USUARIO CON EQUIPO
    @OneToOne//UNA ASIGNACION PARA UN SOLO EQUIPO
    @JoinColumn(name = "id_Equipo")//LO QUE BUSCARA
    private Equipo equipo;//DONDE LO VA A BUSCAR

    //ASIGNACION CON USUARIO
    @ManyToOne//MUCHAS ASIGNACIONES HECHAS POR UN SOLO USUARIO
    @JoinColumn(name = "id_Usuario")//LO QUE BUSCARA
    private Usuario usuario;//DONDE LO VA A BUSCAR

}
