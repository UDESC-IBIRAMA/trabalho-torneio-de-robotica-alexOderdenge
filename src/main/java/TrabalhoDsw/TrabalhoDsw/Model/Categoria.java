package TrabalhoDsw.TrabalhoDsw.Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Alex Oderdenge
 */
@Entity
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<Sala> salas;

    @OneToMany(mappedBy = "categoria")
    private List<Juiz> juizes;

    @OneToMany(mappedBy = "categoria")
    private List<CriterioMissao> criteriosMissoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public List<Juiz> getJuizes() {
        return juizes;
    }

    public void setJuizes(List<Juiz> juizes) {
        this.juizes = juizes;
    }

    public List<CriterioMissao> getCriteiosMissoes() {
        return criteriosMissoes;
    }

    public void setCriteiosMissoes(List<CriterioMissao> criteriosMissoes) {
        this.criteriosMissoes = criteriosMissoes;
    }
}