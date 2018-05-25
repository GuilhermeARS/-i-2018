package com.github.guilhermears.es.integracao.topico1.tarefa3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeitorDeConteudo {

    /**
     * Esta classe recebe o conteudo de um arquivo
     *
     * @param file recebe o conteudo do arquivo lido
     */
    String file;

    public LeitorDeConteudo(String file) {
        this.file = file;
    }

    /**
     * este método lê o conteudo e o retorna em UTF 8
     *
     * @return retorna o conteúdo do arquivo em UTF 8
     */
    public String LeConteudo() throws FileNotFoundException, IOException {
        byte[] conteudo;
        try (FileInputStream fis = new FileInputStream(file)) {
            conteudo = new byte[(int) file.length()];
            fis.read(conteudo);
        }
        String str = new String(conteudo, "UTF-8");
        return str;
    }
}
