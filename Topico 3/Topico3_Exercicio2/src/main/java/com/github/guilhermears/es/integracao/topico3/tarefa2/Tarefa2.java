package com.github.guilhermears.es.integracao.topico3.tarefa2;

import java.io.IOException;

public class Tarefa2 {

    /**
     * Instancia a classe Leitor, passando como parâmetro o endereço para um
     * arquivo XML a ser lido, e então executa o método da mesma que imprime o
     * conteudo do XML, que por sua vez deve ser um conjunto de calçados.
     *
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        final String endereço = "calcados.xml";
        Leitor leitor = new Leitor(endereço);
        leitor.imprimeConteudo();
    }

}
