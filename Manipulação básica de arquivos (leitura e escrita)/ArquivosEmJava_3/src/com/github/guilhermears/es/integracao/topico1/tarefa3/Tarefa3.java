//Guilherme Alves Rosa e Silva 201711009
package com.github.guilhermears.es.integracao.topico1.tarefa3;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Tarefa3 {
/**
 * Esta classe main instancia um leitor, executa o método e exibe o conteúdo em um print
 * @param args argumento string contendo o arquivo a ser lido
 */
        public static void main(String[] args) throws FileNotFoundException, IOException {
           LeitorDeConteudo leitor = new LeitorDeConteudo(args[0]);
           String str = leitor.LeConteudo();

        System.out.println(str);
    }
    
}

    







