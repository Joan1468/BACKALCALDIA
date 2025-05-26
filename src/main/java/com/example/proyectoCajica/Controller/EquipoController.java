package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Equipo;
import com.example.proyectoCajica.Service.EquipoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/equipo")
@Tag(name = "Equipos", description = "Controlador para gestión de equipos")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @PostMapping
    @Operation(summary = "Guardar un equipo", description = "Permite guardar un equipo individual.")
    public ResponseEntity<Equipo> guardar(
            @Parameter(description = "Datos del equipo a guardar", required = true)
            @Valid @RequestBody Equipo equipo) {
        Equipo nuevoEquipo = equipoService.guardar(equipo);
        return ResponseEntity.ok(nuevoEquipo);
    }

    @GetMapping
    @Operation(summary = "Listar equipos", description = "Devuelve una lista con todos los equipos registrados.")
    public ResponseEntity<List<Equipo>> listar() {
        List<Equipo> equipos = equipoService.listar();
        return ResponseEntity.ok(equipos);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar equipo por ID", description = "Permite buscar un equipo por su identificador.")
    public ResponseEntity<Equipo> buscarPorId(
            @Parameter(description = "ID del equipo", required = true)
            @PathVariable Long id) {
        Optional<Equipo> equipo = equipoService.buscarPorId(id);
        return equipo.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar equipo", description = "Permite eliminar un equipo por su ID.")
    public ResponseEntity<Void> eliminar(
            @Parameter(description = "ID del equipo a eliminar", required = true)
            @PathVariable Long id) {
        Optional<Equipo> equipo = equipoService.buscarPorId(id);
        if (equipo.isPresent()) {
            equipoService.eliminar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/lista")
    @Operation(summary = "Guardar varios equipos", description = "Permite guardar una lista de equipos.")
    public ResponseEntity<List<Equipo>> guardarVarios(
            @Parameter(description = "Lista de equipos a guardar", required = true)
            @Valid @RequestBody List<Equipo> equipos) {
        List<Equipo> nuevosEquipos = equipoService.guardarTodos(equipos);
        return ResponseEntity.ok(nuevosEquipos);
    }
}
