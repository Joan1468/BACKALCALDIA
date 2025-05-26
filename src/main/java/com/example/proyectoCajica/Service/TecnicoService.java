package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.Tecnico;
import com.example.proyectoCajica.Repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    public Tecnico guardar(Tecnico tecnico) {
        return tecnicoRepository.save(tecnico);
    }

    public List<Tecnico> listar() {
        return tecnicoRepository.findAll();
    }

    public Optional<Tecnico> buscarPorId(long id) {
        return tecnicoRepository.findById(id);
    }

    public void eliminar(long id) {
        tecnicoRepository.deleteById(id);
    }

    public List<Tecnico> guardarTodos(List<Tecnico> tecnicos) {
        return tecnicoRepository.saveAll(tecnicos);
    }
}
