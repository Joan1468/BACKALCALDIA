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
public class HVEquipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //ATRIBUTOS

    private int id_HV_Equipo;
    private String descripcion;
    private LocalDate fechaIngreso;
    private String observaciones;
    private String rutaManualPDF;

    //RELACIONES

//HV_EQUIPO CON EQUIPO
    @OneToOne//UNA SOLA HOJA DE VIDA POR EQUIPO
    @JoinColumn(name = "id_Equipo")// LO QUE VA A BUSCAR
    private Equipo equipo;//DONDE LO VA A BUSCAR

// HV_EQUIPO CON USUARIO
    @ManyToOne//MUCHAS HOJAS DE VIDA PUEDEN SER HECHAS POR UN SOLO USUARIO
    @JoinColumn(name = "id_Usuario")// LO QUE VA A BUSCAR
    private usuario usuario;//DONDE LO VA A BUSCAR





}
