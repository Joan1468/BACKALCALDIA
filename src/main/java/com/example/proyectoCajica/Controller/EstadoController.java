package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Estado;
import com.example.proyectoCajica.Service.EstadoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estado")
@Tag(name = "Estados", description = "Controlador para gestión de estados")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @PostMapping
    @Operation(summary = "Guardar un estado", description = "Permite guardar un estado individual.")
    public Estado guardar(
            @Parameter(description = "Datos del estado a guardar", required = true)
            @RequestBody Estado estado) {
        return estadoService.guardar(estado);
    }

    @GetMapping
    @Operation(summary = "Listar estados", description = "Devuelve una lista con todos los estados registrados.")
    public List<Estado> listar() {
        return estadoService.listar();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar estado por ID", description = "Permite buscar un estado por su identificador.")
    public Optional<Estado> buscarPorId(
            @Parameter(description = "ID del estado", required = true)
            @PathVariable long id) {
        return estadoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar estado", description = "Permite eliminar un estado por su ID.")
    public void eliminar(
            @Parameter(description = "ID del estado a eliminar", required = true)
            @PathVariable long id) {
        estadoService.eliminar(id);
    }

    @PostMapping("/lista")
    @Operation(summary = "Guardar varios estados", description = "Permite guardar una lista de estados.")
    public List<Estado> guardarVarios(
            @Parameter(description = "Lista de estados a guardar", required = true)
            @RequestBody List<Estado> estados) {
        return estadoService.guardarTodos(estados);
    }
}
