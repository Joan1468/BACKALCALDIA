package com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.HVEquipo;
import com.example.proyectoCajica.Service.HV_EquipoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hv_equipos")
@Tag(name = "HV Equipos", description = "Controlador para gestión de HV Equipos")
public class hv_equiposController {

    @Autowired
    private HV_EquipoService hvEquipoService;

    @PostMapping
    @Operation(summary = "Guardar un HV_Equipo", description = "Permite guardar un HV_Equipo individual.")
    public HVEquipo guardar(
            @Parameter(description = "Datos del HV_Equipo a guardar", required = true)
            @RequestBody HVEquipo hvEquipo) {
        return hvEquipoService.guardar(hvEquipo);
    }

    @GetMapping
    @Operation(summary = "Listar HV Equipos", description = "Devuelve una lista con todos los HV Equipos registrados.")
    public List<HVEquipo> listar() {
        return hvEquipoService.listar();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar HV_Equipo por ID", description = "Permite buscar un HV_Equipo por su identificador.")
    public Optional<HVEquipo> buscarPorId(
            @Parameter(description = "ID del HV_Equipo", required = true)
            @PathVariable long id) {
        return hvEquipoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar HV_Equipo", description = "Permite eliminar un HV_Equipo por su ID.")
    public void eliminar(
            @Parameter(description = "ID del HV_Equipo a eliminar", required = true)
            @PathVariable long id) {
        hvEquipoService.eliminar(id);
    }

    @PostMapping("/lista")
    @Operation(summary = "Guardar varios HV Equipos", description = "Permite guardar una lista de HV Equipos.")
    public List<HVEquipo> guardarVarios(
            @Parameter(description = "Lista de HV Equipos a guardar", required = true)
            @RequestBody List<HVEquipo> hvEquipoList) {
        return hvEquipoService.guardarTodos(hvEquipoList);
    }
}
