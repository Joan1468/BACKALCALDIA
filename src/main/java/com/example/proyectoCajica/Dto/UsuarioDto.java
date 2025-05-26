package com.example.proyectoCajica.Dto;

public class UsuarioDto {
    private String nombre;
    private String correo;
    private Long idTipoDocumento;
    private Long idTipoVinculacion;
    private Long idSecretaria;

    public UsuarioDto() {
    }

    public UsuarioDto(String nombre, String correo, Long idTipoDocumento, Long idTipoVinculacion, Long idSecretaria) {
        this.nombre = nombre;
        this.correo = correo;
        this.idTipoDocumento = idTipoDocumento;
        this.idTipoVinculacion = idTipoVinculacion;
        this.idSecretaria = idSecretaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public Long getIdTipoVinculacion() {
        return idTipoVinculacion;
    }

    public void setIdTipoVinculacion(Long idTipoVinculacion) {
        this.idTipoVinculacion = idTipoVinculacion;
    }

    public Long getIdSecretaria() {
        return idSecretaria;
    }

    public void setIdSecretaria(Long idSecretaria) {
        this.idSecretaria = idSecretaria;
    }
}
