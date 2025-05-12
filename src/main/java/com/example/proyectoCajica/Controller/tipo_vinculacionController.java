package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.tipo_vinculacion;
import com.example.proyectoCajica.Service.tipo_vinculacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipo_vinculacion")
public class tipo_vinculacionController {

    @Autowired
    private tipo_vinculacionService tipoVinculacionService;

    // Guardar un tipo de vinculación
    @PostMapping
    public tipo_vinculacion guardar(@RequestBody tipo_vinculacion tipoVinculacion) {
        return tipoVinculacionService.guardar(tipoVinculacion);
    }

    // Listar todos los tipos de vinculación
    @GetMapping
    public List<tipo_vinculacion> listar() {
        return tipoVinculacionService.listar();
    }

    // Buscar tipo de vinculación por id
    @GetMapping("/{id}")
    public Optional<tipo_vinculacion> buscarPorId(@PathVariable long id) {
        return tipoVinculacionService.buscarPorId(id);
    }

    // Eliminar un tipo de vinculación por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        tipoVinculacionService.eliminar(id);
    }

    // Guardar varios tipos de vinculación
    @PostMapping("/lista")
    public List<tipo_vinculacion> guardarVarios(@RequestBody List<tipo_vinculacion> tiposVinculacionList) {
        return tipoVinculacionService.guardarTodos(tiposVinculacionList);
    }
}