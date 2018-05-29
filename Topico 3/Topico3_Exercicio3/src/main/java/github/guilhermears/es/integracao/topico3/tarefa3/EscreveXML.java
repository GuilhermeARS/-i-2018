package main.java.com.github.guilhermears.es.integracao.topico3.tarefa3;

import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * classe recebe uma Turma, e possui metodos para persistir em XML
 *
 */
public class EscreveXML {

    private Turma turma;

    public EscreveXML(Turma turma) {
        this.turma = turma;
    }

    /**
     * Método persiste, utilizando JAXB, o conteúdo da lista de alunos.
     *
     * @throws JAXBException
     * @throws IOException
     */
    public void escreveXML() throws JAXBException, IOException {

        JAXBContext jaxbContext = JAXBContext.newInstance(Turma.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        jaxbMarshaller.marshal(turma, new File("turma.xml"));
    }

}
