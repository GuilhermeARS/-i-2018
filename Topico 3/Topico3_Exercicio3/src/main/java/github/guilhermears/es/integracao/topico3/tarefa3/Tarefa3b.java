package github.guilhermears.es.integracao.topico3.tarefa3;


import java.io.IOException;
import javax.xml.bind.JAXBException;

/**
 *
 * @author guiar
 */
public class Tarefa3b {

    public static void main(String[] args) throws IOException, JAXBException {
        LeitorXML leitor = new LeitorXML("turma.xml");
        Turma turma = leitor.importaXML();
        imprimeTeste(turma);
    }

       public static void imprimeTeste(Turma turma) {
        turma.getEstudantes().stream().map((estudante) -> {
            System.out.printf("Nome: " + estudante.getNome() + "|");
            return estudante;
        }).map((estudante) -> {
            System.out.printf("Logradouro: " + estudante.getEndereco().getLogradouro() + "|");
            return estudante;
        }).map((estudante) -> {
            System.out.printf("CEP: " + estudante.getEndereco().getCEP()+ "|");
            return estudante;
        }).map((estudante) -> {
            System.out.printf("Numero: " + estudante.getEndereco().getNumero() + "|");
            return estudante;
        }).forEachOrdered((estudante) -> {
            System.out.printf("Complemento: " + estudante.getEndereco().getComplemento() + "|\n\n");
        });

    }
}
