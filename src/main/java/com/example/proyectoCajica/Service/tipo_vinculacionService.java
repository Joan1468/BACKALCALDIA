package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Repository.tipo_vinculacionRepository;
import com.example.proyectoCajica.Model.tipo_vinculacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class tipo_vinculacionService {

    @Autowired
    private tipo_vinculacionRepository tipoVinculacionRepository;

    // Guardar un tipo de vinculación
    public tipo_vinculacion guardar(tipo_vinculacion tipoVinculacion) {
        return tipoVinculacionRepository.save(tipoVinculacion);
    }

    // Listar todos los tipos de vinculación
    public List<tipo_vinculacion> listar() {
        return tipoVinculacionRepository.findAll();
    }

    // Eliminar un tipo de vinculación por su id
    public void eliminar(long id) {
        tipoVinculacionRepository.deleteById(id);
    }

    // Buscar tipo de vinculación por su id
    public Optional<tipo_vinculacion> buscarPorId(long id) {
        return tipoVinculacionRepository.findById(id);
    }

    // Guardar todos los tipos de vinculación
    public List<tipo_vinculacion> guardarTodos(List<tipo_vinculacion> tipoVinculacionList) {
        return tipoVinculacionRepository.saveAll(tipoVinculacionList);
    }
}
