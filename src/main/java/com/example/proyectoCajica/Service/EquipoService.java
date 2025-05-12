package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.Equipo;
import com.example.proyectoCajica.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoService {

    @Autowired
    public EquipoRepository equipoRepository;

    public Equipo guardar(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public List<Equipo> listar() {
        return equipoRepository.findAll();
    }

    public void eliminar(long id) {
        equipoRepository.deleteById(id);
    }

    public Optional<Equipo> buscarPorId(long id) {
        return equipoRepository.findById(id);
    }

    public List<Equipo> guardarTodos(List<Equipo> equipos) {
        return equipoRepository.saveAll(equipos);
    }
}

