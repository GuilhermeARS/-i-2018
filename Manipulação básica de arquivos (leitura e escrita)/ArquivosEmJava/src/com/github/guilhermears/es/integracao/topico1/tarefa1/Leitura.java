package com.github.guilhermears.es.integracao.topico1.tarefa1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * Esta classe recebe no construtor um arquivo.
 */
public class Leitura {

    private String args;

    /**
     *
     * @param args string recebida para ser lida
     */
    public Leitura(String args) {
        this.args = args;
    }

    /**
     * Este método Lê
     *
     * @return este método retorna o que foi lido como int.
     */
    public int ler() throws FileNotFoundException, IOException {

        FileInputStream fis = new FileInputStream(args);
        int valor;
        DataInputStream dis = new DataInputStream(fis);
        valor = dis.readInt();
        return valor;
    }

}
