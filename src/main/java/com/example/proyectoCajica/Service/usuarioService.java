package com.example.proyectoCajica.Service;

import com.example.proyectoCajica.Repository.usuarioRepository;
import com.example.proyectoCajica.Model.usuario;
import com.example.proyectoCajica.Model.tipo_documento;
import com.example.proyectoCajica.Model.tipo_vinculacion;
import com.example.proyectoCajica.Model.secretarias;
import com.example.proyectoCajica.Dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class usuarioService {

    @Autowired
    private usuarioRepository usuarioRepository;

    // Guardar un usuario
    public usuario guardar(usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Listar todos los usuarios
    public List<usuario> listar() {
        return usuarioRepository.findAll();
    }

    // Eliminar un usuario por su id
    public void eliminar(long id) {
        usuarioRepository.deleteById(id);
    }

    // Buscar usuario por su id
    public Optional<usuario> buscarPorId(long id) {
        return usuarioRepository.findById(id);
    }

    // Guardar todos los usuarios
    public List<usuario> guardarTodos(List<usuario> usuariosList) {
        return usuarioRepository.saveAll(usuariosList);
    }

    /**
     * Nuevo método para guardar un usuario usando UsuarioDto.
     * Este método convierte el DTO a la entidad usuario,
     * asigna las referencias a entidades relacionadas usando solo los IDs,
     * y luego guarda la entidad usuario en la base de datos.
     */
    public usuario guardarDesdeDto(UsuarioDto dto) {
        usuario u = new usuario();
        u.setNombre(dto.getNombre());
        u.setCorreo(dto.getCorreo());

        // Asignar relaciones solo con IDs (sin cargar toda la entidad)
        tipo_documento td = new tipo_documento();
        td.setId_tipo_documento(dto.getIdTipoDocumento());
        u.setTipoDocumento(td);

        tipo_vinculacion tv = new tipo_vinculacion();
        tv.setId_tipo_vinculacion(dto.getIdTipoVinculacion());
        u.setTipoVinculacion(tv);

        secretarias sec = new secretarias();
        sec.setId_secretaria(dto.getIdSecretaria());
        u.setSecretarias(sec);

        return usuarioRepository.save(u);
    }
}
