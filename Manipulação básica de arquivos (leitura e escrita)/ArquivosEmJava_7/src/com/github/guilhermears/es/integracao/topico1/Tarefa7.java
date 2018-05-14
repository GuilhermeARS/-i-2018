//Guilherme Alves Rosa e Silva 201711009
package com.github.guilhermears.es.integracao.topico1;


import java.io.IOException;


public class Tarefa7 {

    /**
     * Executa o recebimento do arquivo e o processa nos metodos da classe EscreveBuffer
     * Imprime em outro arquivo um numero de índice a cada linha lida, seguido da própria linha.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        EscreveBuffer escreve = new EscreveBuffer(args);
        escreve.Preenche();
        escreve.EscreveArq();
    }

}
