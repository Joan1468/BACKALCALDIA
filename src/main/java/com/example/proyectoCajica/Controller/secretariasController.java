package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.secretarias;
import com.example.proyectoCajica.Service.secretariasService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/secretarias")
@Tag(name = "secretarias", description = "Controlador para la gestión de secretarias")
public class secretariasController {

    @Autowired
    private secretariasService secretariasService;

    @PostMapping
    @Operation(summary = "Guardar una secretaria", description = "Permite guardar una secretaria individual.")
    public secretarias guardar(
            @Parameter(description = "Datos de la secretaria a guardar", required = true)
            @RequestBody secretarias secretaria) {
        return secretariasService.guardar(secretaria);
    }

    @GetMapping
    @Operation(summary = "Listar secretarias", description = "Devuelve una lista con todas las secretarias registradas.")
    public List<secretarias> listar() {
        return secretariasService.listar();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar secretaria por ID", description = "Permite buscar una secretaria por su identificador.")
    public Optional<secretarias> buscarPorId(
            @Parameter(description = "ID de la secretaria", required = true)
            @PathVariable long id) {
        return secretariasService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una secretaria", description = "Permite eliminar una secretaria por su ID.")
    public void eliminar(
            @Parameter(description = "ID de la secretaria a eliminar", required = true)
            @PathVariable long id) {
        secretariasService.eliminar(id);
    }

    @PostMapping("/lista")
    @Operation(summary = "Guardar varias secretarias", description = "Permite guardar una lista de secretarias.")
    public List<secretarias> guardarVarios(
            @Parameter(description = "Lista de secretarias a guardar", required = true)
            @RequestBody List<secretarias> secretariasList) {
        return secretariasService.guardarTodos(secretariasList);
    }
}
