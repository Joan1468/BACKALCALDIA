
package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Mantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //ATRIBUTOS

    private Long id_Mantenimiento;
    private String descripcion;
    private String observaciones;
    private String correctivo;
    private String preventivo;

    //RELACIONES

    //MANTENIMIENTO CON EQUIPO
    @ManyToOne//MUCHOS MANTENIMINETOS PARA UN SOLO EQUIPO
    @JoinColumn(name = "id_Equipo")// LO QUE VA A BUSCAR
    private  Equipo equipo;//DONDE LO VA A BUSCAR

    //MANTENIMIENTO CON TECNICOS
    @ManyToOne//MUCHOS MANTENIMIENTOS HECHOS POR UN SOLO TECNICO
    @JoinColumn(name = "id_Tecnico")// LO QUE VA A BUSCAR
    private Tecnico tecnico;//DONDE LO VA A BUSCAR

}