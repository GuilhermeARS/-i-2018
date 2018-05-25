package com.github.guilhermears.es.integracao.topico1.tarefa2;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class VerificaJpg {

    private String arquivo;

    /**
     *
     * @param arquivo recebe o arquivo jpg
     */
    public VerificaJpg(String arquivo) {
        this.arquivo = arquivo;
    }

    /**
     * Método lê os dois primeiros e os dois ultimos bytes do JPEG, e retorna um
     * teste se eles batem com ffd8ff2d9, que identifica um JPEG
     *
     * @return retorna um boolean que diz se o arquivo é um JPEG ou não.
     */
    public boolean verificacaoJpeg() throws FileNotFoundException, IOException {

        File arc = new File(arquivo);
        long tamanho = arc.length();
        FileInputStream fis = new FileInputStream(arquivo);
        byte ff;
        byte d8;
        byte ff2;
        byte d9;
        try (DataInputStream dis = new DataInputStream(fis)) {
            ff = dis.readByte();
            d8 = dis.readByte();
            long skip = dis.skip(tamanho - 4);
            ff2 = dis.readByte();
            d9 = dis.readByte();
        }

        boolean teste = ff == (byte) 0xFF || d8 == (byte) 0xD8 || ff2 == (byte) 0xFF || d9 == (byte) 0xD9;
        return teste;
    }
}
