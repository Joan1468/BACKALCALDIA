package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.hv_equipos;
import com.example.proyectoCajica.Service.hv_equiposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hv_equipos")
public class hv_equiposController {

    @Autowired
    private hv_equiposService hv_equiposService;

    // Guardar un hv_equipos
    @PostMapping
    public hv_equipos guardar(@RequestBody hv_equipos hvEquipos) {
        return hv_equiposService.guardar(hvEquipos);
    }

    // Listar todos los hv_equipos
    @GetMapping
    public List<hv_equipos> listar() {
        return hv_equiposService.listar();
    }

    // Buscar hv_equipos por id
    @GetMapping("/{id}")
    public Optional<hv_equipos> buscarPorId(@PathVariable long id) {
        return hv_equiposService.buscarPorId(id);
    }

    // Eliminar un hv_equipos por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        hv_equiposService.eliminar(id);
    }

    // Guardar varios hv_equipos
    @PostMapping("/lista")
    public List<hv_equipos> guardarVarios(@RequestBody List<hv_equipos> hvEquiposList) {
        return hv_equiposService.guardarTodos(hvEquiposList);
    }
}