package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Usuario;
import com.example.proyectoCajica.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Guardar un usuario
    @PostMapping
    public Usuario guardar(@RequestBody Usuario usuario) {
        return usuarioService.guardar(usuario);
    }

    // Listar todos los usuarios
    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listar();
    }

    // Buscar usuario por id
    @GetMapping("/{id}")
    public Optional<Usuario> buscarPorId(@PathVariable long id) {
        return usuarioService.buscarPorId(id);
    }

    // Eliminar un usuario por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        usuarioService.eliminar(id);
    }

    // Guardar varios usuarios
    @PostMapping("/lista")
    public List<Usuario> guardarVarios(@RequestBody List<Usuario> usuarios) {
        return usuarioService.guardarTodos(usuarios);
    }
}
