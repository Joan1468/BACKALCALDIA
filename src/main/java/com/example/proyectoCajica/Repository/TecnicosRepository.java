package com.example.proyectoCajica.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proyectoCajica.Model.Tecnicos;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicosRepository extends JpaRepository<Tecnicos  , Long>
{
}
