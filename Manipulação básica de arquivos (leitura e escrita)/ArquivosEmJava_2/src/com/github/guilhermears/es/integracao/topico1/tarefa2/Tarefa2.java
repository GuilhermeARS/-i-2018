//Guilherme Alves Rosa e Silva 201711009
package com.github.guilhermears.es.integracao.topico1.tarefa2;

import java.io.IOException;

public class Tarefa2 {

    /**
     * Recebe um arquivo como argumento, instancia a classe VerificaJpg e
     * executa o método que testa se é ou não um JPEG, e imprime a resposta
     *
     * @param args recebe o arquivo a ser testado
     */
    public static void main(String[] args) throws IOException {
        VerificaJpg verifica = new VerificaJpg(args[0]);

        boolean eJpeg = verifica.verificacaoJpeg();
        if (eJpeg == true) {
            System.out.println("É um jpeg");

        } else {
            System.out.println("Não é um jpeg");
        }
    }

}
