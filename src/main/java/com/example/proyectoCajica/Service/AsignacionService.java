package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.asignacion;
import com.example.proyectoCajica.Repository.asignacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class asignacionService {

    @Autowired
    public asignacionRepository asignacionRepository;

    public asignacion guardar(asignacion asignacion) {
        return asignacionRepository.save(asignacion);
    }

    public List<asignacion> listar() {
        return asignacionRepository.findAll();
    }

    public void eliminar(long id) {
        asignacionRepository.deleteById(id);
    }

    public Optional<asignacion> buscarPorId(long id) {
        return asignacionRepository.findById(id);
    }

    public List<asignacion> guardarTodos(List<asignacion> asignaciones) {
        return asignacionRepository.saveAll(asignaciones);
    }
}
