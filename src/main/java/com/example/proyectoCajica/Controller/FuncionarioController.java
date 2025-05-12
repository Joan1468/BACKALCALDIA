package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Funcionario;
import com.example.proyectoCajica.Service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    // Guardar un funcionario
    @PostMapping
    public Funcionario guardar(@RequestBody Funcionario funcionario) {
        return funcionarioService.guardar(funcionario);
    }

    // Listar todos los funcionarios
    @GetMapping
    public List<Funcionario> listar() {
        return funcionarioService.listar();
    }

    // Buscar funcionario por id
    @GetMapping("/{id}")
    public Optional<Funcionario> buscarPorId(@PathVariable long id) {
        return funcionarioService.buscarPorId(id);
    }

    // Eliminar un funcionario por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        funcionarioService.eliminar(id);
    }

    // Guardar varios funcionarios
    @PostMapping("/lista")
    public List<Funcionario> guardarVarios(@RequestBody List<Funcionario> funcionarios) {
        return funcionarioService.guardarTodos(funcionarios);
    }
}