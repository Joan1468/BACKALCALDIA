package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.TipoEquipo;
import com.example.proyectoCajica.Service.TipoEquipoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipoequipo")
@Tag(name = "Tipos de Equipo", description = "Controlador para la gestión de tipos de equipo")
public class TipoEquipoController {

    @Autowired
    private TipoEquipoService tipoEquipoService;

    @PostMapping
    @Operation(summary = "Guardar un tipo de equipo", description = "Permite crear un nuevo tipo de equipo.")
    public TipoEquipo guardar(
            @Parameter(description = "Objeto TipoEquipo que contiene los datos a guardar", required = true)
            @RequestBody TipoEquipo tipoEquipo) {
        return tipoEquipoService.guardar(tipoEquipo);
    }

    @GetMapping
    @Operation(summary = "Listar tipos de equipo", description = "Devuelve una lista con todos los tipos de equipo registrados.")
    public List<TipoEquipo> listar() {
        return tipoEquipoService.listar();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar tipo de equipo por ID", description = "Obtiene un tipo de equipo específico mediante su ID.")
    public Optional<TipoEquipo> buscarPorId(
            @Parameter(description = "ID del tipo de equipo a buscar", required = true)
            @PathVariable Long id) {
        return tipoEquipoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un tipo de equipo", description = "Elimina un tipo de equipo existente mediante su ID.")
    public void eliminar(
            @Parameter(description = "ID del tipo de equipo a eliminar", required = true)
            @PathVariable Long id) {
        tipoEquipoService.eliminar(id);
    }

    @PostMapping("/lista")
    @Operation(summary = "Guardar varios tipos de equipo", description = "Permite guardar una lista de tipos de equipo en una sola petición.")
    public List<TipoEquipo> guardarVarios(
            @Parameter(description = "Lista de tipos de equipo a guardar", required = true)
            @RequestBody List<TipoEquipo> tipoEquipos) {
        return tipoEquipoService.guardarTodos(tipoEquipos);
    }
}
