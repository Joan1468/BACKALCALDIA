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
public class secretarias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //ATRIBUTOS

    private int id_secretaria;
    private String secretariaGobierno;
    private String secretariaHacienda;
    private String secretariaPlaneacion;
    private String secretariaEducacion;
    private String secretariaSalud;
    private String secretariaInfraestructura;
    private String secretariaDesarrolloSocial;
    private String secretariaAgricultura;
    private String secretariaMedioAmbiente;
    private String secretariaMovilidad;
    private String secretariaCultura;
    private String secretariaDeporte;
    private String secretariaMujer;
    private String secretariaTIC;
    private String secretariaJuridica;
}
//SIN RELACION
