
package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMantenimiento;

    @ManyToOne
    @JoinColumn(name = "idEquipo")
    private Equipo equipo;

    @ManyToOne
    @JoinColumn(name = "idTecnico")
    private Tecnico tecnico;

    private Date fecha;
    private String observacion;
}