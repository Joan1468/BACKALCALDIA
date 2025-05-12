package com.example.proyectoCajica.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proyectoCajica.Model.tipo_vinculacion;
import org.springframework.stereotype.Repository;

@Repository
public interface tipo_vinculacionRepository extends JpaRepository<tipo_vinculacion  , Long>
{
}
