
package TrabalhoDsw.TrabalhoDsw.Service;

import TrabalhoDsw.TrabalhoDsw.Model.Juiz;
import TrabalhoDsw.TrabalhoDsw.Model.JuizRepositorio;
import TrabalhoDsw.TrabalhoDsw.Model.Sala;
import TrabalhoDsw.TrabalhoDsw.Model.SalaRepositorio;
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
 * @author Alex Oderdenge
 */

@RestController
@RequestMapping("/salas")
public class SalaResource {

    @Autowired
    private SalaRepositorio salas;

    @GetMapping("/{id}")
    public Optional<Sala> buscar (@PathVariable Long id) {
        return salas.findById(id);
    }

    @PostMapping
    public Sala salvar(@RequestBody Sala alter){
        return salas.save(alter);
    }

    @GetMapping
    public List<Sala> listar(){
        return salas.findAll();
    }

    @PutMapping
    public Sala editar(@RequestBody Sala alter){
        return salas.save(alter);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        salas.deleteById(id);
    }
}