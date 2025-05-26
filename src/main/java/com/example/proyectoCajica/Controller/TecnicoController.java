package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Tecnico;
import com.example.proyectoCajica.Service.TecnicoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tecnico")
@Tag(name = "Técnicos", description = "Controlador para la gestión de técnicos")
public class TecnicoController {

    @Autowired
    private TecnicoService tecnicoService;

    @PostMapping
    @Operation(summary = "Guardar un técnico", description = "Permite guardar un técnico individual.")
    public Tecnico guardar(
            @Parameter(description = "Datos del técnico a guardar", required = true)
            @RequestBody Tecnico tecnico) {
        return tecnicoService.guardar(tecnico);
    }

    @GetMapping
    @Operation(summary = "Listar técnicos", description = "Devuelve una lista con todos los técnicos registrados.")
    public List<Tecnico> listar() {
        return tecnicoService.listar();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar técnico por ID", description = "Permite buscar un técnico por su identificador.")
    public Optional<Tecnico> buscarPorId(
            @Parameter(description = "ID del técnico", required = true)
            @PathVariable long id) {
        return tecnicoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un técnico", description = "Permite eliminar un técnico por su ID.")
    public void eliminar(
            @Parameter(description = "ID del técnico a eliminar", required = true)
            @PathVariable long id) {
        tecnicoService.eliminar(id);
    }

    @PostMapping("/lista")
    @Operation(summary = "Guardar varios técnicos", description = "Permite guardar una lista de técnicos.")
    public List<Tecnico> guardarVarios(
            @Parameter(description = "Lista de técnicos a guardar", required = true)
            @RequestBody List<Tecnico> tecnicos) {
        return tecnicoService.guardarTodos(tecnicos);
    }
}
