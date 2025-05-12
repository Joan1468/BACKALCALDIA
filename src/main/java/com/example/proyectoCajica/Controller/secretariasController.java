package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.secretarias;
import com.example.proyectoCajica.Service.secretariasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/secretarias")
public class secretariasController {

    @Autowired
    private secretariasService secretariasService;

    // Guardar una secretaria
    @PostMapping
    public secretarias guardar(@RequestBody secretarias secretaria) {
        return secretariasService.guardar(secretaria);
    }

    // Listar todas las secretarias
    @GetMapping
    public List<secretarias> listar() {
        return secretariasService.listar();
    }

    // Buscar secretaria por id
    @GetMapping("/{id}")
    public Optional<secretarias> buscarPorId(@PathVariable long id) {
        return secretariasService.buscarPorId(id);
    }

    // Eliminar una secretaria por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        secretariasService.eliminar(id);
    }

    // Guardar varias secretarias
    @PostMapping("/lista")
    public List<secretarias> guardarVarios(@RequestBody List<secretarias> secretariasList) {
        return secretariasService.guardarTodos(secretariasList);
    }
}