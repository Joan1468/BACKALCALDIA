package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.tipo_equipo;
import com.example.proyectoCajica.Service.tipo_equipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipo_equipo")
public class tipo_equipoController {

    @Autowired
    private tipo_equipoService tipoEquipoService;

    // Guardar un tipo de equipo
    @PostMapping
    public tipo_equipo guardar(@RequestBody tipo_equipo tipoEquipo) {
        return tipoEquipoService.guardar(tipoEquipo);
    }

    // Listar todos los tipos de equipo
    @GetMapping
    public List<tipo_equipo> listar() {
        return tipoEquipoService.listar();
    }

    // Buscar tipo de equipo por id
    @GetMapping("/{id}")
    public Optional<tipo_equipo> buscarPorId(@PathVariable long id) {
        return tipoEquipoService.buscarPorId(id);
    }

    // Eliminar un tipo de equipo por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        tipoEquipoService.eliminar(id);
    }

    // Guardar varios tipos de equipo
    @PostMapping("/lista")
    public List<tipo_equipo> guardarVarios(@RequestBody List<tipo_equipo> tiposEquipoList) {
        return tipoEquipoService.guardarTodos(tiposEquipoList);
    }
}