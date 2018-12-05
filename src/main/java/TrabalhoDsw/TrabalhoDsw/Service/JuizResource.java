
package TrabalhoDsw.TrabalhoDsw.Service;

import TrabalhoDsw.TrabalhoDsw.Model.Juiz;
import TrabalhoDsw.TrabalhoDsw.Model.JuizRepositorio;
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
@RequestMapping("/juizes")
public class JuizResource {

    @Autowired
    private JuizRepositorio juizes;

    @GetMapping("/{id}")
    public Optional<Juiz> buscar (@PathVariable Long id) {
        return juizes.findById(id);
    }

    @PostMapping
    public Juiz salvar(@RequestBody Juiz alter){
        return juizes.save(alter);
    }

    @GetMapping
    public List<Juiz> listar(){
        return juizes.findAll();
    }

    @PutMapping
    public Juiz editar(@RequestBody Juiz alter){
        return juizes.save(alter);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        juizes.deleteById(id);
    }
}