package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Inventarios;
import com.example.proyectoCajica.Service.InventariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventarios")
public class InventariosController {

    @Autowired
    private InventariosService inventariosService;

    // Guardar un inventario
    @PostMapping
    public Inventarios guardar(@RequestBody Inventarios inventarios) {
        return inventariosService.guardar(inventarios);
    }

    // Listar todos los inventarios
    @GetMapping
    public List<Inventarios> listar() {
        return inventariosService.listar();
    }

    // Buscar inventario por id
    @GetMapping("/{id}")
    public Optional<Inventarios> buscarPorId(@PathVariable long id) {
        return inventariosService.buscarPorId(id);
    }

    // Eliminar un inventario por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        inventariosService.eliminar(id);
    }

    // Guardar varios inventarios
    @PostMapping("/lista")
    public List<Inventarios> guardarVarios(@RequestBody List<Inventarios> inventariosList) {
        return inventariosService.guardarTodos(inventariosList);
    }
}