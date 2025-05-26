package com.example.proyectoCajica.Repository;

import com.example.proyectoCajica.Model.HVEquipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HV_EquipoRepository extends JpaRepository<HVEquipo, Long> {
}
