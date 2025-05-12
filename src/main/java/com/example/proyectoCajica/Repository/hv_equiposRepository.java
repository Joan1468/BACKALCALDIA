package com.example.proyectoCajica.Repository;
import com.example.proyectoCajica.Model.hv_equipos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hv_equiposRepository extends JpaRepository<hv_equipos  , Long>
{
}
