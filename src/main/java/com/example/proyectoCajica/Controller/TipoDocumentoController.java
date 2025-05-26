package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.tipo_documento;
import com.example.proyectoCajica.Service.TipoDocumentoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipo_documento")
@Tag(name = "Tipos de Documento", description = "Controlador para la gestión de tipos de documento")
public class TipoDocumentoController {

    @Autowired
    private TipoDocumentoService tipoDocumentoService;

    @PostMapping
    @Operation(summary = "Guardar un tipo de documento", description = "Permite crear un nuevo tipo de documento en el sistema.")
    public tipo_documento guardar(
            @Parameter(description = "Objeto tipoDocumento que contiene los datos a guardar", required = true)
            @RequestBody tipo_documento tipoDocumento) {
        return tipoDocumentoService.guardar(tipoDocumento);
    }

    @GetMapping
    @Operation(summary = "Listar tipos de documento", description = "Devuelve una lista con todos los tipos de documento registrados.")
    public List<tipo_documento> listar() {
        return tipoDocumentoService.listar();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar tipo de documento por ID", description = "Obtiene un tipo de documento específico mediante su ID.")
    public Optional<tipo_documento> buscarPorId(
            @Parameter(description = "ID del tipo de documento a buscar", required = true)
            @PathVariable long id) {
        return tipoDocumentoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un tipo de documento", description = "Elimina un tipo de documento existente mediante su ID.")
    public void eliminar(
            @Parameter(description = "ID del tipo de documento a eliminar", required = true)
            @PathVariable long id) {
        tipoDocumentoService.eliminar(id);
    }

    @PostMapping("/lista")
    @Operation(summary = "Guardar varios tipos de documento", description = "Permite guardar una lista de tipos de documento en una sola petición.")
    public List<tipo_documento> guardarVarios(
            @Parameter(description = "Lista de tipos de documento a guardar", required = true)
            @RequestBody List<tipo_documento> tipoDocumentos) {
        return tipoDocumentoService.guardarTodos(tipoDocumentos);
    }
}
