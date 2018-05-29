package main.java.com.github.guilhermears.es.integracao.topico3.tarefa3;

import java.io.IOException;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Classe recebe como parametro um caminho para um XML, e possui métodos para ler o xml e inserir em uma Turma.
 */
public class LeitorXML {

    private String path;
    private Turma turma;

    public LeitorXML(String path) {
        this.path = path;
    }
    
   /**
    * Método consome o XML, importando para a Turma todo o conteudo.
     * @return retorna uma Turma preenchida
    * @throws IOException 
     * @throws javax.xml.bind.JAXBException 
    */
    public Turma importaXML() throws IOException, JAXBException {

        JAXBContext context = JAXBContext.newInstance(Turma.class);
        Unmarshaller un = context.createUnmarshaller();
        turma = (Turma) un.unmarshal(new FileReader(path));
        return turma;
    }
}
