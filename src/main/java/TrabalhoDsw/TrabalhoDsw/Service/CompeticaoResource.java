package TrabalhoDsw.TrabalhoDsw.Service;

import TrabalhoDsw.TrabalhoDsw.Model.Competicao;
import TrabalhoDsw.TrabalhoDsw.Model.CompeticaoRepositorio;
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
@RequestMapping("competicoes")
public class CompeticaoResource {

    @Autowired
    private CompeticaoRepositorio competicoes;

    @GetMapping("/{id}")
    public Optional<Competicao> buscar (@PathVariable Long id) {
        return competicoes.findById(id);
    }

    @PostMapping
    public Competicao salvar(@RequestBody Competicao comp){
        return competicoes.save(comp);
    }

    @GetMapping
    public List<Competicao> listar(){
        return competicoes.findAll();
    }

    @PutMapping
    public Competicao editar(@RequestBody Competicao comp){
        return competicoes.save(comp);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        competicoes.deleteById(id);
    }
}