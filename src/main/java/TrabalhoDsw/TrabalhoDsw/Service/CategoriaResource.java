package TrabalhoDsw.TrabalhoDsw.Service;

import TrabalhoDsw.TrabalhoDsw.Model.Categoria;
import TrabalhoDsw.TrabalhoDsw.Model.CategoriaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Odedenge
 */

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaRepositorio categorias;

    @GetMapping("/{id}")
    public Optional<Categoria> buscar (@PathVariable Long id) {
        return categorias.findById(id);
    }

    @PostMapping
    public Categoria salvar(@RequestBody Categoria cat) {
        return categorias.save(cat);
    }

    @GetMapping
    public List<Categoria> listar() {
        return categorias.findAll();
    }

    @PutMapping
    public Categoria editar(@RequestBody Categoria cat) {
        return categorias.save(cat);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        categorias.deleteById(id);
    }
}