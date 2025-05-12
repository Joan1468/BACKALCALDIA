package com.example.proyectoCajica.Repository;
import com.example.proyectoCajica.Model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario  , Long>
{
}
