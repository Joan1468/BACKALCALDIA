package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Estado;
import com.example.proyectoCajica.Service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estado")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    // Guardar un estado
    @PostMapping
    public Estado guardar(@RequestBody Estado estado) {
        return estadoService.guardar(estado);
    }

    // Listar todos los estados
    @GetMapping
    public List<Estado> listar() {
        return estadoService.listar();
    }

    // Buscar estado por id
    @GetMapping("/{id}")
    public Optional<Estado> buscarPorId(@PathVariable long id) {
        return estadoService.buscarPorId(id);
    }

    // Eliminar un estado por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        estadoService.eliminar(id);
    }

    // Guardar varios estados
    @PostMapping("/lista")
    public List<Estado> guardarVarios(@RequestBody List<Estado> estados) {
        return estadoService.guardarTodos(estados);
    }
}