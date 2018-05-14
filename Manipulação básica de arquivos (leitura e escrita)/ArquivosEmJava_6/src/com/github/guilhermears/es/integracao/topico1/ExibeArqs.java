package com.github.guilhermears.es.integracao.topico1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ExibeArqs {
    Scanner arq;
    String[] args;

    /**
     * Construtor recebe o argumento em String[] que recebeu um arquivo de
     * texto.
     *
     * @param args arquivo de entrada
     * @throws java.io.FileNotFoundException
     */
    public ExibeArqs(String[] args) throws FileNotFoundException {
        this.args = args;
    }

    /**
     * Método lê, linha a linha o arquivo e imprime a
     * cada iteração até o fim do arquivo.
     *
     * @throws java.io.UnsupportedEncodingException
     */
    public void Exibir() throws UnsupportedEncodingException, IOException {
        arq = new Scanner(new FileReader(args[0]));
        while (arq.hasNextLine()) {
            String linha = arq.nextLine();
            System.out.println(linha);
        }

    }
}
