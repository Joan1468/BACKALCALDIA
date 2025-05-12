package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Tecnico;
import com.example.proyectoCajica.Service.TecnicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tecnicos")
public class TecnicosController {

    @Autowired
    private TecnicosService tecnicosService;

    // Guardar un técnico
    @PostMapping
    public Tecnico guardar(@RequestBody Tecnico tecnico) {
        return tecnicosService.guardar(tecnico);
    }

    // Listar todos los técnicos
    @GetMapping
    public List<Tecnico> listar() {
        return tecnicoService.listar();
    }

    // Buscar técnico por id
    @GetMapping("/{id}")
    public Optional<Tecnico> buscarPorId(@PathVariable long id) {
        return tecnicosService.buscarPorId(id);
    }

    // Eliminar un técnico por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        tecnicosService.eliminar(id);
    }

    // Guardar varios técnicos
    @PostMapping("/lista")
    public List<Tecnicos> guardarVarios(@RequestBody List<Tecnicos> tecnicosList) {
        return tecnicosService.guardarTodos(tecnicosList);