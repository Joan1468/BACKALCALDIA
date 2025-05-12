package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.Marca;
import com.example.proyectoCajica.Repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {

    @Autowired
    public MarcaRepository marcaRepository;

    public Marca guardar(Marca marca) {
        return marcaRepository.save(marca);
    }

    public List<Marca> listar() {
        return marcaRepository.findAll();
    }

    public void eliminar(long id) {
        marcaRepository.deleteById(id);
    }

    public Optional<Marca> buscarPorId(long id) {
        return marcaRepository.findById(id);
    }

    public List<Marca> guardarTodos(List<Marca> marcas) {
        return marcaRepository.saveAll(marcas);
    }
}
