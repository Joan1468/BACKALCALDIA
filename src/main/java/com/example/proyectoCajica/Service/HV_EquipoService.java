package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.hv_equipos;
import com.example.proyectoCajica.Repository.hv_equiposRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class hv_equiposService {

    @Autowired
    public hv_equiposRepository hv_equiposRepository;

    public hv_equipos guardar(hv_equipos hvEquipos) {
        return hv_equiposRepository.save(hvEquipos);
    }

    public List<hv_equipos> listar() {
        return hv_equiposRepository.findAll();
    }

    public void eliminar(long id) {
        hv_equiposRepository.deleteById(id);
    }

    public Optional<hv_equipos> buscarPorId(long id) {
        return hv_equiposRepository.findById(id);
    }

    public List<hv_equipos> guardarTodos(List<hv_equipos> hvEquiposList) {
        return hv_equiposRepository.saveAll(hvEquiposList);
    }
}
