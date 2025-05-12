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
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //ATRIBUTOS

    private Long id_marca;
    private String nombre_Equipo;  // "HP", "Dell", "Lenovo"
    private String paisOrigen;     // "Estados Unidos", "China"
    private String descripcion;    // Descripción general de la marca
    private String sitioWeb;       // URL del sitio web oficial(opcional)

//RELACIONES

    //UNA MARCA PARA MUCHOS EQUIPOS
    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL, orphanRemoval = true)// LO QUE VA A BUSCAR
    private List<Equipo> equipo;//DONDE LO VA A BUSCAR

}
