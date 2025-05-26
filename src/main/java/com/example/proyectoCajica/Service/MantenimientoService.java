package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.Mantenimiento;
import com.example.proyectoCajica.Repository.MantenimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MantenimientoService {

    @Autowired
    private MantenimientoRepository mantenimientoRepository;

    public Mantenimiento guardar(Mantenimiento mantenimiento) {
        return mantenimientoRepository.save(mantenimiento);
    }

    public List<Mantenimiento> listar() {
        return mantenimientoRepository.findAll();
    }

    public Optional<Mantenimiento> buscarPorId(long id) {
        return mantenimientoRepository.findById(id);
    }

    public void eliminar(long id) {
        mantenimientoRepository.deleteById(id);
    }

    public List<Mantenimiento> guardarTodos(List<Mantenimiento> mantenimientos) {
        return mantenimientoRepository.saveAll(mantenimientos);
    }
}
