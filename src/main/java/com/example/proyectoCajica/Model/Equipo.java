package com.example.proyectoCajica.Model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //ENTIDADES

    private Long id_Equipo;//LLAVE PRIMARIA (SOLO ESTA LLEVA ID)
    private String hostname;
    private String modelo;
    private String serial;
    private String placa;
    private LocalDate fecha_Fabricacion;
    private String nombre_Equipo;
    private String ipv4;
    private String  ipv6;

    //RELACIONES

//EQUIPO CON ASIGNACION
    @OneToOne //UNO A UNO (UN EQUIPO SOLO PUEDE TENER UNA ASIGNACION).
    @JoinColumn(name = "id_Asignacion")// ID QUE BUSCARA EN LA OTRA TABLA
    private Asignacion asignacion;//TABLA EN LA QUE VA A BUSCAR

//EQUIPO CON MARCA
    @ManyToOne//MUCHOS A UNO (MUCHOS EQUIPOS SOLO TIENEN UNA MARCA).
    @JoinColumn(name = "id_marca")
    private Marca marca;//DONDE LO VA A BUSCAR

//EQUIPO CON  TIPO_EQUIPO
    @ManyToOne//MUCHOS A UNO (MUCHOS EQUIPOS SON DE UNA SOLA MARCA)
    @JoinColumn(name = "id_tipo_equipo")
    private Tipo_Equipo tipo_equipo;//DONDE LO VA A BUSCAR

//EQUIPO CON ESTADO
    @ManyToOne//MUCHOS A UNO ( MUCHOS EQUIPOS TIENEN UN SOLO ESTADO).
    @JoinColumn(name = "id_Estado")
    private Estado estado;//DONDE LO VA A BUSCAR

//EQUIPO CON HV_EQUIPO
    @OneToOne// UNO A UNO (UN EQUIPO SOLO PUEDE TENER UNA UNICA HOJA DE VIDA).
    @JoinColumn(name = "id_HV_Equipo")
    private HV_Equipo hv_equipo;//DONDE LO VA A BUSCAR

//EQUIPO CON INVENTARIO
    @OneToMany //MUCHOS EQUIPOS PARA UN INVENTARIOS
    @JoinColumn(name = "id_Inventario")
    private Inventario inventario;//DONDE LO VA A BUSCAR

    //EQUIPO COM NATENIMIENTO
    //UN EQUIPO PUEDE TENER MUCHOS MANTENIMIENTOS
    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)// LO QUE VA A BUSCAR
    private List<Mantenimiento> mantenimiento;//DONDE LO VA A BUSCAR

}

