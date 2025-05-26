package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoEquipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoEquipo;

    private String tipo;

    @OneToMany(mappedBy = "tipoEquipo")
    private List<Equipo> Equipo;
}