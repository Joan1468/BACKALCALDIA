package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Asignacion;
import com.example.proyectoCajica.Service.AsignacionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/asignaciones")
@Tag(name = "Asignaciones", description = "Controlador de Asignaciones")
public class AsignacionController {

    @Autowired
    private AsignacionService asignacionService;

    @PostMapping
    @Operation(summary = "Guardar una asignación", description = "Permite guardar una asignación individual.")
    public Asignacion guardar(
            @Parameter(description = "Datos de la asignación a guardar", required = true)
            @RequestBody Asignacion asignacion) {
        return asignacionService.guardar(asignacion);
    }

    @GetMapping
    @Operation(summary = "Listar asignaciones", description = "Devuelve una lista con todas las asignaciones registradas.")
    public List<Asignacion> listar() {
        return asignacionService.listar();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar asignación por ID", description = "Permite buscar una asignación por su identificador.")
    public Optional<Asignacion> buscarPorId(
            @Parameter(description = "ID de la asignación", required = true)
            @PathVariable int id) {
        return asignacionService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar asignación", description = "Permite eliminar una asignación por su ID.")
    public void eliminar(
            @Parameter(description = "ID de la asignación a eliminar", required = true)
            @PathVariable int id) {
        asignacionService.eliminar(id);
    }

    @PostMapping("/varias")
    @Operation(summary = "Guardar varias asignaciones", description = "Permite guardar una lista de asignaciones.")
    public List<Asignacion> guardarVarias(
            @Parameter(description = "Lista de asignaciones a guardar", required = true)
            @RequestBody List<Asignacion> asignaciones) {
        return asignacionService.guardarTodos(asignaciones);
    }
}
