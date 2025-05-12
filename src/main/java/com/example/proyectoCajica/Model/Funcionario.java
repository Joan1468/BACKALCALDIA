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
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //ATRIBUTOS

    private int id_funcionario;

    //RELACIONES

//FUNCIONARIO CON SECRETARIAS
    @ManyToOne//MUCHOS FUNCIONARIOS PERTENECEN A UNA SOLA SECRETARIA
    @JoinColumn(name = "id_secretaria")// LO QUE VA A BUSCAR
    private secretarias secretarias;//DONDE LO VA A BUSCAR

//FUNCIONARIO CON  USUARIO
    @OneToOne//UN FUNCIONARIO SOLO REPRESENTA UN USUARIO
    @JoinColumn(name = "id_Usuario")// LO QUE VA A BUSCAR
    private Usuario usuario;//DONDE LO VA A BUSCAR

}



