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
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //ATRIBUTOS

    private int id_Tecnico;
    private String dependencia;
    private String nombre;

    //RELACIONES

    //TECNICO CON MANTENIMINENTO
    //UN TECNICO PUEDE HACER MUCHOS MANTENIMIENTOS
    @OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL)//LO QUE VA A BUSCAR
    private List<Mantenimiento> Mantenimiento;// DONDE LO VA A BUSCAR

//TECNICO CON USUARIO
    @OneToOne//UN TECNICO SOLO REPRESENTA UN USUARIO
    @JoinColumn(name = "id_Usuario")// LO QUE VA A BUSCAR
    private usuario usuario;//DONDE LO VA A BUSCAR

}
