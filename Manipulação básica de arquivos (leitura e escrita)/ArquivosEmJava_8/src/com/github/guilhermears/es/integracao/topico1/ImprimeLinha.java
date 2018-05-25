package com.github.guilhermears.es.integracao.topico1;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

public class ImprimeLinha {

    int linha;
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    byte[] tamIndice;

    RandomAccessFile arq;
    String[] args;

    /**
     * Construtor recebe o argumento em String[] que recebeu um arquivo de
     * texto.
     *
     * @param args arquivo de entrada
     * @param linha
     * @throws java.io.FileNotFoundException
     */
    public ImprimeLinha(String[] args, int linha) throws FileNotFoundException {
        this.args = args;
        this.linha = linha - 2;
        arq = new RandomAccessFile(args[0], "r");
    }

    /**
     * Método lê a metainformação, pula os bytes e vai direto a linha pedida
     *
     * @return retorna a linha
     * @throws java.io.UnsupportedEncodingException
     */
    public String imprimir() throws UnsupportedEncodingException, IOException {
        int tamIndex = arq.readInt();
        arq.skipBytes(linha * 4);
        int index = arq.readInt();
        arq.skipBytes(tamIndex * 4 - (linha * 4));
        arq.skipBytes(index);
        int tamanhoLinha = arq.readInt();
        return arq.readLine();
    }

}
