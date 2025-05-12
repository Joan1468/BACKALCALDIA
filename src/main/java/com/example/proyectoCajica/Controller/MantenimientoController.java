package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Mantenimiento;
import com.example.proyectoCajica.Service.MantenimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mantenimiento")
public class MantenimientoController {

    @Autowired
    private MantenimientoService mantenimientoService;

    // Guardar un mantenimiento
    @PostMapping
    public Mantenimiento guardar(@RequestBody Mantenimiento mantenimiento) {
        return mantenimientoService.guardar(mantenimiento);
    }

    // Listar todos los mantenimientos
    @GetMapping
    public List<Mantenimiento> listar() {
        return mantenimientoService.listar();
    }

    // Buscar mantenimiento por id
    @GetMapping("/{id}")
    public Optional<Mantenimiento> buscarPorId(@PathVariable long id) {
        return mantenimientoService.buscarPorId(id);
    }

    // Eliminar un mantenimiento por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        mantenimientoService.eliminar(id);
    }

    // Guardar varios mantenimientos
    @PostMapping("/lista")
    public List<Mantenimiento> guardarVarios(@RequestBody List<Mantenimiento> mantenimientos) {
        return mantenimientoService.guardarTodos(mantenimientos);
    }
}