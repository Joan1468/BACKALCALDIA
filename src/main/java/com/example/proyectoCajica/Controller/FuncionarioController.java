package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Funcionario;
import com.example.proyectoCajica.Service.FuncionarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionario")
@Tag(name = "Funcionarios", description = "Controlador para gestión de funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    @Operation(summary = "Guardar un funcionario", description = "Permite guardar un funcionario individual.")
    public Funcionario guardar(
            @Parameter(description = "Datos del funcionario a guardar", required = true)
            @RequestBody Funcionario funcionario) {
        return funcionarioService.guardar(funcionario);
    }

    @GetMapping
    @Operation(summary = "Listar funcionarios", description = "Devuelve una lista con todos los funcionarios registrados.")
    public List<Funcionario> listar() {
        return funcionarioService.listar();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar funcionario por ID", description = "Permite buscar un funcionario por su identificador.")
    public Optional<Funcionario> buscarPorId(
            @Parameter(description = "ID del funcionario", required = true)
            @PathVariable long id) {
        return funcionarioService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar funcionario", description = "Permite eliminar un funcionario por su ID.")
    public void eliminar(
            @Parameter(description = "ID del funcionario a eliminar", required = true)
            @PathVariable long id) {
        funcionarioService.eliminar(id);
    }

    @PostMapping("/lista")
    @Operation(summary = "Guardar varios funcionarios", description = "Permite guardar una lista de funcionarios.")
    public List<Funcionario> guardarVarios(
            @Parameter(description = "Lista de funcionarios a guardar", required = true)
            @RequestBody List<Funcionario> funcionarios) {
        return funcionarioService.guardarTodos(funcionarios);
    }
}
