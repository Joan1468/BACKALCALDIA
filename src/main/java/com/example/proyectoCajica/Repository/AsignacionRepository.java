package com.example.proyectoCajica.Repository;
import com.example.proyectoCajica.Model.asignacion;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface asignacionRepository extends JpaRepository<asignacion , Long>


{

}
