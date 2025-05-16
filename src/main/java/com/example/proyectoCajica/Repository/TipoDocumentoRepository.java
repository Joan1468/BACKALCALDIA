package com.example.proyectoCajica.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proyectoCajica.Model.tipo_documento;
import org.springframework.stereotype.Repository;

@Repository
public interface tipo_documentoRepository extends JpaRepository<tipo_documento  , Long>
{
}
