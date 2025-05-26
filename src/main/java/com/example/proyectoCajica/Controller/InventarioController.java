package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Inventario;
import com.example.proyectoCajica.Service.InventarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventario")
@Tag(name = "Inventarios", description = "Controlador para gestión de inventarios")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @PostMapping
    @Operation(summary = "Guardar un inventario", description = "Permite guardar un inventario individual.")
    public Inventario guardar(
            @Parameter(description = "Datos del inventario a guardar", required = true)
            @RequestBody Inventario inventario) {
        return inventarioService.guardar(inventario);
    }

    @GetMapping
    @Operation(summary = "Listar inventarios", description = "Devuelve una lista con todos los inventarios registrados.")
    public List<Inventario> listar() {
        return inventarioService.listar();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar inventario por ID", description = "Permite buscar un inventario por su identificador.")
    public Optional<Inventario> buscarPorId(
            @Parameter(description = "ID del inventario", required = true)
            @PathVariable Long id) {
        return inventarioService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar inventario", description = "Permite eliminar un inventario por su ID.")
    public void eliminar(
            @Parameter(description = "ID del inventario a eliminar", required = true)
            @PathVariable Long id) {
        inventarioService.eliminar(id);
    }

    @PostMapping("/lista")
    @Operation(summary = "Guardar varios inventarios", description = "Permite guardar una lista de inventarios.")
    public List<Inventario> guardarVarios(
            @Parameter(description = "Lista de inventarios a guardar", required = true)
            @RequestBody List<Inventario> inventarios) {
        return inventarioService.guardarTodos(inventarios);
    }
}
