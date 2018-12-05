
package TrabalhoDsw.TrabalhoDsw.Service;

import TrabalhoDsw.TrabalhoDsw.Model.Sala;
import TrabalhoDsw.TrabalhoDsw.Model.SalaRepositorio;
import TrabalhoDsw.TrabalhoDsw.Model.Temporada;
import TrabalhoDsw.TrabalhoDsw.Model.TemporadaRepositorio;
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
@RequestMapping("/temporadas")
public class TemporadaResource {

    @Autowired
    private TemporadaRepositorio temporadas;

    @GetMapping("/{id}")
    public Optional<Temporada> buscar (@PathVariable Long id) {
        return temporadas.findById(id);
    }

    @PostMapping
    public Temporada salvar(@RequestBody Temporada alter){
        return temporadas.save(alter);
    }

    @GetMapping
    public List<Temporada> listar(){
        return temporadas.findAll();
    }

    @PutMapping
    public Temporada editar(@RequestBody Temporada alter){
        return temporadas.save(alter);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        temporadas.deleteById(id);
    }
}