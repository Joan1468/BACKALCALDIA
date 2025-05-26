package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.usuario;
import com.example.proyectoCajica.Service.usuarioService;
import com.example.proyectoCajica.Dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario") // URL base: http://localhost:8080/usuario
public class UsuarioController {

    @Autowired
    private usuarioService usuarioService;

    // Guardar un usuario
    @PostMapping("/guardar")
    public usuario guardar(@RequestBody usuario usuario) {
        return usuarioService.guardar(usuario);
    }

    // Listar todos los usuarios
    @GetMapping
    public List<usuario> listar() {
        return usuarioService.listar();
    }

    // Buscar usuario por ID
    @GetMapping("/{id}")
    public Optional<usuario> buscarPorId(@PathVariable long id) {
        return usuarioService.buscarPorId(id);
    }

    // Eliminar un usuario por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        usuarioService.eliminar(id);
    }

    // Guardar varios usuarios
    @PostMapping("/lista")
    public List<usuario> guardarVarios(@RequestBody List<usuario> usuarios) {
        return usuarioService.guardarTodos(usuarios);
    }

    // NUEVO MÉTODO - Guardar un usuario desde un DTO
    // Recibe un UsuarioDto en el cuerpo de la petición y lo convierte para guardar en la BD
    @PostMapping("/guardarDto")
    public usuario guardarDesdeDto(@RequestBody UsuarioDto usuarioDto) {
        return usuarioService.guardarDesdeDto(usuarioDto);
    }
}
