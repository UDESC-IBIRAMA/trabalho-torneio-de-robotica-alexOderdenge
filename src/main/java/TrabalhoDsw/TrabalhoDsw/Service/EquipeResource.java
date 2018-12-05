package TrabalhoDsw.TrabalhoDsw.Service;

import TrabalhoDsw.TrabalhoDsw.Model.Equipe;
import TrabalhoDsw.TrabalhoDsw.Model.EquipeRepositorio;
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
 * @author Dênis
 */
@RestController
@RequestMapping("/equipes")
public class EquipeResource {

    @Autowired
    private EquipeRepositorio equipes;

    @GetMapping("/{id}")
    public Optional<Equipe> buscar (@PathVariable Long id) {
        return equipes.findById(id);
    }

    @PostMapping
    public Equipe salvar(@RequestBody Equipe equip) {
        return equipes.save(equip);
    }

    @GetMapping
    public List<Equipe> listar() {
        return equipes.findAll();
    }

    @PutMapping
    public Equipe editar(@RequestBody Equipe equip) {
        return equipes.save(equip);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        equipes.deleteById(id);
    }
}