package main.java.com.github.guilhermears.es.integracao.topico3.tarefa3;

/**
 * classe representa um Estudante
 */
public class Estudante {

    private String nome;

    private Endereco endereco;

    public Estudante(String nome, Endereco endereco) {

        this.nome = nome;
        this.endereco = endereco;

    }

    public Estudante() {
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
