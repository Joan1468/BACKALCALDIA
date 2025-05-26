package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Marca;
import com.example.proyectoCajica.Service.MarcaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marca")
@Tag(name = "Marcas", description = "Controlador para gestión de marcas")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @PostMapping
    @Operation(summary = "Guardar una marca", description = "Permite guardar una marca individual.")
    public Marca guardar(
            @Parameter(description = "Datos de la marca a guardar", required = true)
            @RequestBody Marca marca) {
        return marcaService.guardar(marca);
    }

    @GetMapping
    @Operation(summary = "Listar marcas", description = "Devuelve una lista con todas las marcas registradas.")
    public List<Marca> listar() {
        return marcaService.listar();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar marca por ID", description = "Permite buscar una marca por su identificador.")
    public Optional<Marca> buscarPorId(
            @Parameter(description = "ID de la marca", required = true)
            @PathVariable long id) {
        return marcaService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una marca", description = "Permite eliminar una marca por su ID.")
    public void eliminar(
            @Parameter(description = "ID de la marca a eliminar", required = true)
            @PathVariable long id) {
        marcaService.eliminar(id);
    }

    @PostMapping("/lista")
    @Operation(summary = "Guardar varias marcas", description = "Permite guardar una lista de marcas.")
    public List<Marca> guardarVarios(
            @Parameter(description = "Lista de marcas a guardar", required = true)
            @RequestBody List<Marca> marcas) {
        return marcaService.guardarTodos(marcas);
    }
}
