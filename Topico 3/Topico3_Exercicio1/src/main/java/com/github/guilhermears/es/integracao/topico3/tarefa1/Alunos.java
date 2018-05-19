
package com.github.guilhermears.es.integracao.topico3.tarefa1;
import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * classe contem a lista de alunos e a definição para o xml
 */
    @XmlRootElement()
    @XmlAccessorType(XmlAccessType.FIELD)
public class Alunos {
    

 
    @XmlElement(name = "aluno")

    private List<Aluno> alunos;

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}

