package TrabalhoDsw.TrabalhoDsw.Service;

import TrabalhoDsw.TrabalhoDsw.Model.CriterioMissao;
import TrabalhoDsw.TrabalhoDsw.Model.CriterioMissaoRepositorio;
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
@RequestMapping("criterios")
public class CriterioMissaoResource {

    @Autowired
    private CriterioMissaoRepositorio criterios;

    @GetMapping("/{id}")
    public Optional<CriterioMissao> buscar (@PathVariable Long id) {
        return criterios.findById(id);
    }

    @PostMapping
    public CriterioMissao salvar(@RequestBody CriterioMissao cri){
        return criterios.save(cri);
    }

    @GetMapping
    public List<CriterioMissao> listar(){
        return criterios.findAll();
    }

    @PutMapping
    public CriterioMissao editar(@RequestBody CriterioMissao cri){
        return criterios.save(cri);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        criterios.deleteById(id);
    }
}
