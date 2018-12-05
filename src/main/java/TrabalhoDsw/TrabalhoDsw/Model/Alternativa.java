package TrabalhoDsw.TrabalhoDsw.Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Alex Oderdenge
 */
@Entity
public class Alternativa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double valor;

    @ManyToOne
    private CriterioMissao criterioMissao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public CriterioMissao getCriterioMissao() {
        return criterioMissao;
    }

    public void setCriterioMissao(CriterioMissao criterioMissao) {
        this.criterioMissao = criterioMissao;
    }
}