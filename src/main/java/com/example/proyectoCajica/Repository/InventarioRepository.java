package com.example.proyectoCajica.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proyectoCajica.Model.Inventarios;
import org.springframework.stereotype.Repository;

@Repository
public interface InventariosRepository extends JpaRepository<Inventarios  , Long>
{
}
