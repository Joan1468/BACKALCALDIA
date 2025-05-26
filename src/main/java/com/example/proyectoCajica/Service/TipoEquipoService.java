package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.TipoEquipo;
import com.example.proyectoCajica.Repository.TipoEquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoEquipoService {

    @Autowired
    private TipoEquipoRepository tipoEquipoRepository;

    public TipoEquipo guardar(TipoEquipo tipoEquipo) {
        return tipoEquipoRepository.save(tipoEquipo);
    }

    public List<TipoEquipo> listar() {
        return tipoEquipoRepository.findAll();
    }

    public Optional<TipoEquipo> buscarPorId(Long id) {
        return tipoEquipoRepository.findById(id);
    }

    public void eliminar(Long id) {
        tipoEquipoRepository.deleteById(id);
    }

    public List<TipoEquipo> guardarTodos(List<TipoEquipo> tipoEquipos) {
        return tipoEquipoRepository.saveAll(tipoEquipos);
    }
}

