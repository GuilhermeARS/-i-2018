package com.github.guilhermears.es.integracao.topico3.tarefa2;

import org.apache.commons.lang3.StringUtils;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * Classe recebe como parametro um caminho para um XML, e possui métodos para carregar este conteudo e imprimir.
 */
public class Leitor {

    private String path;
    private Calçados calcado;

    public Leitor(String path) {
        this.path = path;
    }

   /**
    * Método consome o XML, importando para a classe Calçados todo o conteudo.
    * @throws IOException 
    */
    public void importaXML() throws IOException {

        ObjectMapper om = new XmlMapper();
        calcado = om.readValue(StringUtils.toEncodedString(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8), Calçados.class);

    }

    /**
     * Método executa o método importarXML, então imprime todo o conteúdo de Sapatos e 
     * Tenis contidos em calçados
     * @throws IOException 
     */
    public void imprimeConteudo() throws IOException {
        importaXML();
        System.out.println("Sapatos");
        for (Sapato sapato : calcado.getSapato()) {
            System.out.printf("| Marca: " + sapato.getMarca() + " |");
            System.out.printf("| Cor: " + sapato.getCor() + " |");
            System.out.printf("| Preço: " + sapato.getPreco() + " |\n");
        }
        System.out.println("Tenis");
        for (Tenis teni : calcado.getTenis()) {
            System.out.printf("| Marca: " + teni.getMarca() + " |");
            System.out.printf("| Esporte: " + teni.getEsporte() + " |");
            System.out.printf("| Preço: " + teni.getPreco() + " |\n");
        }

    }

}
