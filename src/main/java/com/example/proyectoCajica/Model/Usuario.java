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
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //ATRIBUTOS
    
    private int id_Usuario;
    private String nombre;
    private String username;
    private String password;
    private String correo;
    private String rol;

//RELACIONES

//USUARIO CON SECRETARIA
    @ManyToOne//MUCHOS USUARIOS SON DE UNA SOLA SECRETARIA
    @JoinColumn(name = "id_secretaria")// LO QUE VA A BUSCAR
    private secretarias secretarias;//DONDE LO VA A BUSCAR

//USUARIO CON FUNCIONARIO
    @ManyToOne// UN USUARIO ES UN FUNCIONARIO
    @JoinColumn(name = "id_funcionario")// LO QUE VA A BUSCAR
    private Funcionario funcionario;//DONDE LO VA A BUSCAR

//USUARIO CON ASIGNACION
    //UN USUARIO PUEDE HACER MUCHAS ASIGNACIONES
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)// LO QUE VA A BUSCAR
    private List<Asignacion> asignacion;//DONDE LO VA A BUSCAR

//TECNICO CON  USUARIO
    @OneToOne//UN TECNICO SOLO REPRESENTA UN USUARIO
    @JoinColumn(name = "id_Tecnico")// LO QUE VA A BUSCAR
    private Tecnico tecnico;//DONDE LO VA A BUSCAR

//USUARIO CON TIPO_VINCULACION
    @ManyToOne //MUCHAS USUARIOS TIENEN UN TIPO DE VINCULACION SOLAMENTE
    @JoinColumn(name = "id_tipo_vinculacion")// LO QUE VA A BUSCAR
    private tipo_vinculacion tipo_vinculacion;//DONDE LO VA A BUSCAR

//USUARIO CON TIPO_DOCUMENTO
    @ManyToOne//MUCHOS USUARIOS TIENEN UN SOLO TIPO DE DOCUMENTO
    @JoinColumn(name = "id_tipo_documento")// LO QUE VA A BUSCAR
    private Tipo_documento tipo_documento; //DONDE LO VA A BUSCAR
}
