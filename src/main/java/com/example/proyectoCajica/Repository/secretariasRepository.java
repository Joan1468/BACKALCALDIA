package com.example.proyectoCajica.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proyectoCajica.Model.secretarias;
import org.springframework.stereotype.Repository;


@Repository
public interface secretariasRepository extends JpaRepository<secretarias, Long> {
}
