package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Equipo;
import com.example.proyectoCajica.Service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/equipo")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    // Guardar un equipo
    @PostMapping
    public Equipo guardar(@RequestBody Equipo equipo) {
        return equipoService.guardar(equipo);
    }

    // Listar todos los equipos
    @GetMapping
    public List<Equipo> listar() {
        return equipoService.listar();
    }

    // Buscar equipo por id
    @GetMapping("/{id}")
    public Optional<Equipo> buscarPorId(@PathVariable long id) {
        return equipoService.buscarPorId(id);
    }

    // Eliminar un equipo por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        equipoService.eliminar(id);
    }

    // Guardar varios equipos
    @PostMapping("/lista")
    public List<Equipo> guardarVarios(@RequestBody List<Equipo> equipos) {
        return equipoService.guardarTodos(equipos);
    }
}