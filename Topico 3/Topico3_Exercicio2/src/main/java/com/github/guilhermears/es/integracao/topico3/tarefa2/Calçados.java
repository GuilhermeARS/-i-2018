package com.github.guilhermears.es.integracao.topico3.tarefa2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Classe representa o conjunto dos calçados, compostos de um conjunto de tênis
 * e um conjunto de sapatos. Com as devidas marcações para a leitura no XML
 */
@JacksonXmlRootElement(localName = "calcados")
public class Calçados {

    @JacksonXmlElementWrapper(localName = "tenis", useWrapping = false)
    private Tenis[] tenis;

    @JacksonXmlElementWrapper(localName = "sapato", useWrapping = false)
    private Sapato[] sapato;

    public Calçados() {
    }

    public Calçados(Tenis[] tenis, Sapato[] sapato) {
        this.tenis = tenis;
        this.sapato = sapato;
    }

    public Tenis[] getTenis() {
        return tenis;
    }

    public void setTenis(Tenis[] tenis) {
        this.tenis = tenis;
    }

    public Sapato[] getSapato() {
        return sapato;
    }

    public void setSapato(Sapato[] sapato) {
        this.sapato = sapato;
    }

}
