package com.github.guilhermears.es.integracao.topico3.tarefa1;

import java.io.IOException;
import javax.xml.bind.JAXBException;

public class Tarefa1 {

    /**
     * Recebe um endereço de um CSV e o converte para um XML
     *
     * @param args Endereço de um CSV
     * @throws JAXBException
     * @throws IOException
     */
    public static void main(String[] args) throws JAXBException, IOException {
        CSVparaXML conversor = new CSVparaXML(args[0]);
        conversor.escreveXML();

    }
}
