package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Repository.UsuarioRepository;
import com.example.proyectoCajica.Model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Guardar un usuario
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Listar todos los usuarios
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    // Eliminar un usuario por su id
    public void eliminar(long id) {
        usuarioRepository.deleteById(id);
    }

    // Buscar usuario por su id
    public Optional<Usuario> buscarPorId(long id) {
        return usuarioRepository.findById(id);
    }

    // Guardar todos los usuarios
    public List<Usuario> guardarTodos(List<Usuario> usuariosList) {
        return usuarioRepository.saveAll(usuariosList);
    }
}
