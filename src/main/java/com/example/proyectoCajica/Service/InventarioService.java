package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.Inventario;
import com.example.proyectoCajica.Repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public Inventario guardar(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    public List<Inventario> listar() {
        return inventarioRepository.findAll();
    }

    public Optional<Inventario> buscarPorId(Long id) {
        return inventarioRepository.findById(id);
    }

    public void eliminar(Long id) {
        inventarioRepository.deleteById(id);
    }

    public List<Inventario> guardarTodos(List<Inventario> inventarios) {
        return inventarioRepository.saveAll(inventarios);
    }
}
