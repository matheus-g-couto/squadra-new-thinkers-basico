package pkgnew.thinkers.cozinha;

import java.util.Date;

/**
 *
 * @author Matheus Couto
 */
public class Ingrediente {

    private String nome;
    private Date dataValidade;

    public Ingrediente() {
    }

    public Ingrediente(String nome, Date dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

}
