package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.Funcionario;
import com.example.proyectoCajica.Repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    public FuncionarioRepository funcionarioRepository;

    public Funcionario guardar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> listar() {
        return funcionarioRepository.findAll();
    }

    public void eliminar(long id) {
        funcionarioRepository.deleteById(id);
    }

    public Optional<Funcionario> buscarPorId(long id) {
        return funcionarioRepository.findById(id);
    }

    public List<Funcionario> guardarTodos(List<Funcionario> funcionarios) {
        return funcionarioRepository.saveAll(funcionarios);
    }
}
