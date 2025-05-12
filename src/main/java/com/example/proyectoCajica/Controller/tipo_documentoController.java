package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.tipo_documento;
import com.example.proyectoCajica.Service.tipo_documentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipo_documento")
public class tipo_documentoController {

    @Autowired
    private tipo_documentoService tipoDocumentoService;

    // Guardar un tipo de documento
    @PostMapping
    public tipo_documento guardar(@RequestBody tipo_documento tipoDocumento) {
        return tipoDocumentoService.guardar(tipoDocumento);
    }

    // Listar todos los tipos de documento
    @GetMapping
    public List<tipo_documento> listar() {
        return tipoDocumentoService.listar();
    }

    // Buscar tipo de documento por id
    @GetMapping("/{id}")
    public Optional<tipo_documento> buscarPorId(@PathVariable long id) {
        return tipoDocumentoService.buscarPorId(id);
    }

    // Eliminar un tipo de documento por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        tipoDocumentoService.eliminar(id);
    }

    // Guardar varios tipos de documento
    @PostMapping("/lista")
    public List<tipo_documento> guardarVarios(@RequestBody List<tipo_documento> tiposDocumentoList) {
        return tipoDocumentoService.guardarTodos(tiposDocumentoList);
    }
}