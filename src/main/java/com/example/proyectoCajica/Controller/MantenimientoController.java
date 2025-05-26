package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Mantenimiento;
import com.example.proyectoCajica.Service.MantenimientoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mantenimiento")
@Tag(name = "Mantenimientos", description = "Controlador para gestión de mantenimientos")
public class MantenimientoController {

    @Autowired
    private MantenimientoService mantenimientoService;

    @PostMapping
    @Operation(summary = "Guardar un mantenimiento", description = "Permite guardar un mantenimiento individual.")
    public Mantenimiento guardar(
            @Parameter(description = "Datos del mantenimiento a guardar", required = true)
            @RequestBody Mantenimiento mantenimiento) {
        return mantenimientoService.guardar(mantenimiento);
    }

    @GetMapping
    @Operation(summary = "Listar mantenimientos", description = "Devuelve una lista con todos los mantenimientos registrados.")
    public List<Mantenimiento> listar() {
        return mantenimientoService.listar();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar mantenimiento por ID", description = "Permite buscar un mantenimiento por su identificador.")
    public Optional<Mantenimiento> buscarPorId(
            @Parameter(description = "ID del mantenimiento", required = true)
            @PathVariable long id) {
        return mantenimientoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar mantenimiento", description = "Permite eliminar un mantenimiento por su ID.")
    public void eliminar(
            @Parameter(description = "ID del mantenimiento a eliminar", required = true)
            @PathVariable long id) {
        mantenimientoService.eliminar(id);
    }

    @PostMapping("/lista")
    @Operation(summary = "Guardar varios mantenimientos", description = "Permite guardar una lista de mantenimientos.")
    public List<Mantenimiento> guardarVarios(
            @Parameter(description = "Lista de mantenimientos a guardar", required = true)
            @RequestBody List<Mantenimiento> mantenimientos) {
        return mantenimientoService.guardarTodos(mantenimientos);
    }
}
