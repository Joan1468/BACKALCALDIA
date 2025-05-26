package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.secretarias;
import com.example.proyectoCajica.Repository.secretariasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class secretariasService {

    @Autowired
    private secretariasRepository repository;

    // Crear o actualizar una secretaria
    public secretarias guardar(secretarias secretaria) {
        return repository.save(secretaria);
    }

    // Obtener todas las secretarías
    public List<secretarias> listar() {
        return repository.findAll();
    }

    // Eliminar por ID (modificado a Long)
    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    // Buscar por ID (modificado a Long)
    public Optional<secretarias> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Guardar una lista completa
    public List<secretarias> guardarTodos(List<secretarias> lista) {
        return repository.saveAll(lista);
    }
}