//Guilherme Alves Rosa e Silva 201711009
package com.github.guilhermears.es.integracao.topico1.tarefa1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Tarefa1 {

    /**
     * Esta classe instancia "Leitura" passando um arquivo em args[0] como
     * argumento, chama o método ler e exibe o resultado em int como Hexadecimal
     *
     * @param args é a entrada do arquivo para escrita
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Leitura le = new Leitura(args[0]);
        int valor = le.ler();
        System.out.printf("%X", valor);

    }

}
