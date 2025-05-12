package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Repository.tipo_documentoRepository;
import com.example.proyectoCajica.Model.tipo_documento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class tipo_documentoService {

    @Autowired
    private tipo_documentoRepository tipoDocumentoRepository;

    // Guardar un tipo de documento
    public tipo_documento guardar(tipo_documento tipoDocumento) {
        return tipoDocumentoRepository.save(tipoDocumento);
    }

    // Listar todos los tipos de documentos
    public List<tipo_documento> listar() {
        return tipoDocumentoRepository.findAll();
    }

    // Eliminar un tipo de documento por su id
    public void eliminar(long id) {
        tipoDocumentoRepository.deleteById(id);
    }

    // Buscar tipo de documento por su id
    public Optional<tipo_documento> buscarPorId(long id) {
        return tipoDocumentoRepository.findById(id);
    }

    // Guardar todos los tipos de documentos
    public List<tipo_documento> guardarTodos(List<tipo_documento> tipoDocumentosList) {
        return tipoDocumentoRepository.saveAll(tipoDocumentosList);
    }
}
