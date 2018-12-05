
package TrabalhoDsw.TrabalhoDsw.Service;

import TrabalhoDsw.TrabalhoDsw.Model.Integrante;
import TrabalhoDsw.TrabalhoDsw.Model.IntegranteRepositorio;
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
@RequestMapping("/integrantes")
public class IntegranteResource {

    @Autowired
    private IntegranteRepositorio integrantes;

    @GetMapping("/{id}")
    public Optional<Integrante> buscar (@PathVariable Long id) {
        return integrantes.findById(id);
    }

    @PostMapping
    public Integrante salvar(@RequestBody Integrante alter){
        return integrantes.save(alter);
    }

    @GetMapping
    public List<Integrante> listar(){
        return integrantes.findAll();
    }

    @PutMapping
    public Integrante editar(@RequestBody Integrante alter){
        return integrantes.save(alter);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        integrantes.deleteById(id);
    }
}