package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistorialEquipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistorial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEquipo", nullable = false)
    private Equipo equipo;

    private String observacion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
}