package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.asignacion;
import com.example.proyectoCajica.Service.asignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/asignacion")
public class asignacionController {

    @Autowired
    private asignacionService asignacionService;

    // Guardar una asignación
    @PostMapping
    public asignacion guardar(@RequestBody asignacion asignacion) {
        return asignacionService.guardar(asignacion);
    }

    // Listar todas las asignaciones
    @GetMapping
    public List<asignacion> listar() {
        return asignacionService.listar();
    }

    // Buscar asignación por id
    @GetMapping("/{id}")
    public Optional<asignacion> buscarPorId(@PathVariable long id) {
        return asignacionService.buscarPorId(id);
    }

    // Eliminar una asignación por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        asignacionService.eliminar(id);
    }

    // Guardar varias asignaciones
    @PostMapping("/lista")
    public List<asignacion> guardarVarios(@RequestBody List<asignacion> asignaciones) {
        return asignacionService.guardarTodos(asignaciones);
    }
}