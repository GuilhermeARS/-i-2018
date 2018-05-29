package github.guilhermears.es.integracao.topico3.tarefa3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBException;

public class Tarefa3a {

    /**
     * Programa persiste em um XML, uma lista de alunos e seus dados
     * Main criado para testes que gera uma turma.
     * @param args
     * @throws javax.xml.bind.JAXBException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws JAXBException, IOException {
        List<Estudante> estudantes = preencheAleatorio();

        Turma turma = new Turma(estudantes);

        EscreveXML conversor = new EscreveXML(turma);
        conversor.escreveXML();

    }

    /**
     * Método gera uma turma fictícia, para fins de teste
     *
     * @return
     */
    public static List<Estudante> preencheAleatorio() {
        List<Estudante> estudantes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Endereco endereco = new Endereco("740000"+i, "rua fulana"+i, i, "casa azul"+i);
            Estudante estudante = new Estudante("Fulanoide de Cicrano"+i, endereco);
            estudantes.add(estudante);
        }
        return estudantes;
    }
}
