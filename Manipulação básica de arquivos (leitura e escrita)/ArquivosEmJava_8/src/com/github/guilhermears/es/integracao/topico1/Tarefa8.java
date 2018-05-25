//Guilherme Alves Rosa e Silva 201711009
package com.github.guilhermears.es.integracao.topico1;

import java.io.IOException;

public class Tarefa8 {

    /**
     * Executa o recebimento do arquivo e o processa nos metodos da classe
     * ImprimeLinha então imprime a linha pedida
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String print;
        ImprimeLinha imprime = new ImprimeLinha(args, Integer.parseInt(args[1]));
        print = imprime.imprimir();
        System.out.println(print);
    }

}
