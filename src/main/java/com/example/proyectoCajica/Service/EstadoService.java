package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.Estado;
import com.example.proyectoCajica.Repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    public EstadoRepository estadoRepository;

    public Estado guardar(Estado estado) {
        return estadoRepository.save(estado);
    }

    public List<Estado> listar() {
        return estadoRepository.findAll();
    }

    public void eliminar(long id) {
        estadoRepository.deleteById(id);
    }

    public Optional<Estado> buscarPorId(long id) {
        return estadoRepository.findById(id);
    }

    public List<Estado> guardarTodos(List<Estado> estados) {
        return estadoRepository.saveAll(estados);
    }
}
