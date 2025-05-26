package com.example.proyectoCajica.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String nombre;
    private String correo;


    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private tipo_documento tipoDocumento; // Esta propiedad debe existir



    @ManyToOne
    @JoinColumn(name = "id_tipo_vinculacion") // Nombre de la columna en BD
    private tipo_vinculacion tipoVinculacion; // Esta propiedad debe existir

    @ManyToOne
    @JoinColumn(name = "id_secretaria") // Nombre de la columna en BD
    private secretarias secretarias; // Esta propiedad debe existir
}
