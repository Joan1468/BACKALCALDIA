package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Repository.secretariasRepository;
import com.example.proyectoCajica.Model.secretarias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class secretariasService {

    @Autowired
    private secretariasRepository secretariasRepository;

    // Guardar una secretaria
    public secretarias guardar(secretarias secretaria) {
        return secretariasRepository.save(secretaria);
    }

    // Listar todas las secretarias
    public List<secretarias> listar() {
        return secretariasRepository.findAll();
    }

    // Eliminar una secretaria por su id
    public void eliminar(long id) {
        secretariasRepository.deleteById(id);
    }

    // Buscar secretaria por su id
    public Optional<secretarias> buscarPorId(long id) {
        return secretariasRepository.findById(id);
    }

    // Guardar todas las secretarias
    public List<secretarias> guardarTodos(List<secretarias> secretariasList) {
        return secretariasRepository.saveAll(secretariasList);
    }
}
