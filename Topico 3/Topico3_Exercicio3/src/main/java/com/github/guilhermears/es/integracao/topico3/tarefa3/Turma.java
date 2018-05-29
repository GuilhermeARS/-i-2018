package main.java.com.github.guilhermears.es.integracao.topico3.tarefa3;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * classe contem a lista de Estudantes e a definicão para o xml
 */
@XmlRootElement()
@XmlType(propOrder = {"estudantes"})
public class Turma {

    private List<Estudante> estudantes;

    public Turma() {
    }

    public Turma(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    @XmlElement(name = "estudante")
    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }
}
