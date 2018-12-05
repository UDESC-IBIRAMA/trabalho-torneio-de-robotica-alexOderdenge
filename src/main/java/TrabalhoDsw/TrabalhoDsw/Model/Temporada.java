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
public class Temporada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String descricao;

    @OneToMany(mappedBy = "temporada")
    private List<Competicao> competicoes;

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

    public List<Competicao> getCompeticoes() {
        return competicoes;
    }

    public void setCompeticoes(List<Competicao> competicoes) {
        this.competicoes = competicoes;
    }
}