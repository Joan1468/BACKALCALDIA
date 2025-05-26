package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipo;

    private String serial;
    private String placa;

    @ManyToOne
    @JoinColumn(name = "idTipoEquipo")
    private TipoEquipo tipoEquipo;

    @ManyToOne
    @JoinColumn(name = "idMarca")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "idInventario")
    private Inventario inventario;


    @OneToMany(mappedBy = "equipo")
    private List<Mantenimiento> mantenimientos;

    @OneToMany(mappedBy = "equipo")
    private List<HistorialEquipo> historial;
}
