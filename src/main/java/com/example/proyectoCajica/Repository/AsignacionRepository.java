package com.example.proyectoCajica.Repository;

import com.example.proyectoCajica.Model.Asignacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignacionRepository extends JpaRepository<Asignacion, Integer> {
}
