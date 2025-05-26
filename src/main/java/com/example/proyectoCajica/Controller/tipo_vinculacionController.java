package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.tipo_vinculacion;
import com.example.proyectoCajica.Service.tipo_vinculacionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipo_vinculacion")
@Tag(name = "Tipos de Vinculación", description = "Controlador para la gestión de tipos de vinculación")
public class tipo_vinculacionController {

    @Autowired
    private tipo_vinculacionService tipoVinculacionService;

    @PostMapping
    @Operation(summary = "Guardar un tipo de vinculación", description = "Permite crear un nuevo tipo de vinculación.")
    public tipo_vinculacion guardar(
            @Parameter(description = "Datos del tipo de vinculación a guardar", required = true)
            @RequestBody tipo_vinculacion tipo_vinculacion) {
        return tipoVinculacionService.guardar(tipo_vinculacion);
    }

    @GetMapping
    @Operation(summary = "Listar tipos de vinculación", description = "Devuelve una lista con todos los tipos de vinculación registrados.")
    public List<tipo_vinculacion> listar() {
        return tipoVinculacionService.listar();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar tipo de vinculación por ID", description = "Permite buscar un tipo de vinculación por su identificador.")
    public Optional<tipo_vinculacion> buscarPorId(
            @Parameter(description = "ID del tipo de vinculación", required = true)
            @PathVariable long id) {
        return tipoVinculacionService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un tipo de vinculación", description = "Permite eliminar un tipo de vinculación mediante su ID.")
    public void eliminar(
            @Parameter(description = "ID del tipo de vinculación a eliminar", required = true)
            @PathVariable long id) {
        tipoVinculacionService.eliminar(id);
    }

    @PostMapping("/lista")
    @Operation(summary = "Guardar varios tipos de vinculación", description = "Permite guardar una lista de tipos de vinculación.")
    public List<tipo_vinculacion> guardarVarios(
            @Parameter(description = "Lista de tipos de vinculación a guardar", required = true)
            @RequestBody List<tipo_vinculacion> tiposVinculacionList) {
        return tipoVinculacionService.guardarTodos(tiposVinculacionList);
    }
}
