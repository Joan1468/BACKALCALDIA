package com.example.proyectoCajica.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proyectoCajica.Model.tipo_equipo;
import org.springframework.stereotype.Repository;

@Repository
public interface tipo_equipoRepository extends JpaRepository<tipo_equipo  , Long>
{
}
