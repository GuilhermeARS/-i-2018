//Guilherme Alves Rosa e Silva 201711009
package com.github.guilhermears.es.integracao.topico1;

import java.io.IOException;

public class Tarefa6 {

    /**
     * Executa o recebimento do arquivo e o processa nos metodos da classe
     * ExibeArq Imprime em outro arquivo um numero contendo o tamanho em bytes
     * de cada linha lida do primeiro, seguido da própria linha.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ExibeArqs exibe = new ExibeArqs(args);
        exibe.Exibir();
    }

}
