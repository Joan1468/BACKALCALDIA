package com.example.proyectoCajica.Model;

    import jakarta.persistence.*;
    import lombok.*;

    import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmarca;
    private String nombreEquipo;  // "HP", "Dell", "Lenovo"
    private String paisOrigen;     // "Estados Unidos", "China"
    private String descripcion;    // Descripción general de la marca
    private String sitioWeb;       // URL del sitio web oficial

}