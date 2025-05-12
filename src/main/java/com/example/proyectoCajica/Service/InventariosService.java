package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.Inventarios;
import com.example.proyectoCajica.Repository.InventariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventariosService {

    @Autowired
    public InventariosRepository inventariosRepository;

    public Inventarios guardar(Inventarios inventario) {
        return inventariosRepository.save(inventario);
    }

    public List<Inventarios> listar() {
        return inventariosRepository.findAll();
    }

    public void eliminar(long id) {
        inventariosRepository.deleteById(id);
    }

    public Optional<Inventarios> buscarPorId(long id) {
        return inventariosRepository.findById(id);
    }

    public List<Inventarios> guardarTodos(List<Inventarios> inventarios) {
        return inventariosRepository.saveAll(inventarios);
    }
}
