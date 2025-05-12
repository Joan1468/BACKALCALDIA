package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Repository.tipo_equipoRepository;
import com.example.proyectoCajica.Model.tipo_equipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class tipo_equipoService {

    @Autowired
    private tipo_equipoRepository tipoEquipoRepository;

    // Guardar un tipo de equipo
    public tipo_equipo guardar(tipo_equipo tipoEquipo) {
        return tipoEquipoRepository.save(tipoEquipo);
    }

    // Listar todos los tipos de equipos
    public List<tipo_equipo> listar() {
        return tipoEquipoRepository.findAll();
    }

    // Eliminar un tipo de equipo por su id
    public void eliminar(long id) {
        tipoEquipoRepository.deleteById(id);
    }

    // Buscar tipo de equipo por su id
    public Optional<tipo_equipo> buscarPorId(long id) {
        return tipoEquipoRepository.findById(id);
    }

    // Guardar todos los tipos de equipos
    public List<tipo_equipo> guardarTodos(List<tipo_equipo> tipoEquiposList) {
        return tipoEquipoRepository.saveAll(tipoEquiposList);
    }
}
