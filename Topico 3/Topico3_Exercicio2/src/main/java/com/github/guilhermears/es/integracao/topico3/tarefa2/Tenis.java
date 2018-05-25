package com.github.guilhermears.es.integracao.topico3.tarefa2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Classe representa um Tênis, com suas devidas marcações para leitura do XML
 *
 */
public class Tenis {

    @JacksonXmlProperty(localName = "marca")
    private String marca;

    @JacksonXmlProperty(localName = "preco")
    private float preco;

    @JacksonXmlProperty(localName = "esporte")
    private String esporte;

    public Tenis() {
    }

    public Tenis(String marca, float preco, String esporte) {
        this.marca = marca;
        this.preco = preco;
        this.esporte = esporte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

}
