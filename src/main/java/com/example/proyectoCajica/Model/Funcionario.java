package com.example.proyectoCajica.Model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFuncionario;

    @OneToOne
    @JoinColumn(name = "idUsuario")
    private usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idSecretaria")
    private secretarias secretarias;

    @ManyToOne
    @JoinColumn(name = "idTipoVinculacion")
    private tipo_vinculacion tipo_vinculacion;


}
