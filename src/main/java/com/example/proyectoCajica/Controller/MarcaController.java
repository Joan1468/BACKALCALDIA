ppackage com.example.proyectoCajica.Controller;

import com.example.proyectoCajica.Model.Marca;
import com.example.proyectoCajica.Service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marca")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    // Guardar una marca
    @PostMapping
    public Marca guardar(@RequestBody Marca marca) {
        return marcaService.guardar(marca);
    }

    // Listar todas las marcas
    @GetMapping
    public List<Marca> listar() {
        return marcaService.listar();
    }

    // Buscar marca por id
    @GetMapping("/{id}")
    public Optional<Marca> buscarPorId(@PathVariable long id) {
        return marcaService.buscarPorId(id);
    }

    // Eliminar una marca por id
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        marcaService.eliminar(id);
    }

    // Guardar varias marcas
    @PostMapping("/lista")
    public List<Marca> guardarVarios(@RequestBody List<Marca> marcas) {
        return marcaService.guardarTodos(marcas);
    }
}