package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.Asignacion;
import com.example.proyectoCajica.Repository.AsignacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignacionService {

    @Autowired
    private AsignacionRepository asignacionRepository;

    public Asignacion guardar(Asignacion asignacion) {
        return asignacionRepository.save(asignacion);
    }

    public List<Asignacion> listar() {
        return asignacionRepository.findAll();
    }

    public void eliminar(int id) {
        asignacionRepository.deleteById(id);
    }

    public Optional<Asignacion> buscarPorId(int id) {
        return asignacionRepository.findById(id);
    }

    public List<Asignacion> guardarTodos(List<Asignacion> asignaciones) {
        return asignacionRepository.saveAll(asignaciones);
    }
}
