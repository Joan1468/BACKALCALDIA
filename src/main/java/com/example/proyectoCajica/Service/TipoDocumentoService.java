package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Model.tipo_documento;
import com.example.proyectoCajica.Repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDocumentoService {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    public tipo_documento guardar(tipo_documento tipoDocumento) {
        return tipoDocumentoRepository.save(tipoDocumento);
    }

    public List<tipo_documento> listar() {
        return tipoDocumentoRepository.findAll();
    }

    public Optional<tipo_documento> buscarPorId(Long id) {
        return tipoDocumentoRepository.findById(id);
    }

    public void eliminar(Long id) {
        tipoDocumentoRepository.deleteById(id);
    }

    public List<tipo_documento> guardarTodos(List<tipo_documento> tipoDocumentos) {
        return tipoDocumentoRepository.saveAll(tipoDocumentos);
    }
}
