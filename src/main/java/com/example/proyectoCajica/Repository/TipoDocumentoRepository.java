package com.example.proyectoCajica.Repository;

import com.example.proyectoCajica.Model.tipo_documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoRepository extends JpaRepository<tipo_documento, Long> {
}
