package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.HVEquipo;
import com.example.proyectoCajica.Repository.HV_EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HV_EquipoService {

    @Autowired
    private HV_EquipoRepository hvEquipoRepository;

    public HVEquipo guardar(HVEquipo hvEquipo) {
        return hvEquipoRepository.save(hvEquipo);
    }

    public List<HVEquipo> listar() {
        return hvEquipoRepository.findAll();
    }

    public void eliminar(long id) {
        hvEquipoRepository.deleteById(id);
    }

    public Optional<HVEquipo> buscarPorId(long id) {
        return hvEquipoRepository.findById(id);
    }

    public List<HVEquipo> guardarTodos(List<HVEquipo> hvEquiposList) {
        return hvEquipoRepository.saveAll(hvEquiposList);
    }
}
