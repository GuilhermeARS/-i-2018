package com.github.guilhermears.es.integracao.topico3.tarefa1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
/**
 * classe recebe o endereço de um arquivo CSV e o converte para XML
 * 
 */
public class CSVparaXML {

    private Alunos alunos = new Alunos();
    private ArrayList<Aluno> arrayAluno = new ArrayList<Aluno>();
    private String file;
/**
 * 
 * @param file endereço do arquivo CSV
 */
    public CSVparaXML(String file) {
        this.file = file;
    }

    /**
     * método lê o CSV, linha a linha, separa por vírgula e passa cada item do 
     * CSV para um objeto na classe aluno, e finalmente coloca os mesmos na lista Alunos
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void leCSV() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String leitor = br.readLine();

        while ((leitor = br.readLine()) != null) {
            String[] linha = leitor.split(",");
            Aluno aluno = new Aluno();
            aluno.setNome(linha[0]);
            aluno.setEmail(linha[1]);
            arrayAluno.add(aluno);
        }
        alunos.setAlunos(arrayAluno);
    }
/**
 * Método persiste, utilizando JAXB, o conteúdo da lista de alunos.
 * @throws JAXBException
 * @throws IOException 
 */
    public void escreveXML() throws JAXBException, IOException {
        leCSV();
        JAXBContext jaxbContext = JAXBContext.newInstance(Alunos.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        jaxbMarshaller.marshal(alunos, new File("alunos.xml"));
    }

}
