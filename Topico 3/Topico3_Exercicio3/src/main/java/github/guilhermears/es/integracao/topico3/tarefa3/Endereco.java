package github.guilhermears.es.integracao.topico3.tarefa3;


/**
 * Representa o endereço do estudante.
 */
public class Endereco {

    private String CEP;
    private String logradouro;
    private int numero;
    private String complemento;

    public Endereco(String CEP, String logradouro, int numero, String complemento) {
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Endereco() {
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
