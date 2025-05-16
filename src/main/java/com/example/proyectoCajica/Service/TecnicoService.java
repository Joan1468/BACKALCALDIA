package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Repository.TecnicosRepository;
import com.example.proyectoCajica.Model.Tecnicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnicosService {

    @Autowired
    private TecnicosRepository tecnicosRepository;

    // Guardar un técnico
    public Tecnicos guardar(Tecnicos tecnico) {
        return tecnicosRepository.save(tecnico);
    }

    // Listar todos los técnicos
    public List<Tecnicos> listar() {
        return tecnicosRepository.findAll();
    }

    // Eliminar un técnico por su id
    public void eliminar(long id) {
        tecnicosRepository.deleteById(id);
    }

    // Buscar técnico por su id
    public Optional<Tecnicos> buscarPorId(long id) {
        return tecnicosRepository.findById(id);
    }

    // Guardar todos los técnicos
    public List<Tecnicos> guardarTodos(List<Tecnicos> tecnicosList) {
        return tecnicosRepository.saveAll(tecnicosList);
    }
}
