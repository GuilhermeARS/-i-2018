/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.guilhermears.es.integracao.topico3.tarefa2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Classe representa um Sapato, com suas devidas marcações para leitura do XML
 *
 */
public class Sapato {

    @JacksonXmlProperty(localName = "marca")
    private String marca;

    @JacksonXmlProperty(localName = "preco")
    private float preco;

    @JacksonXmlProperty(localName = "cor")
    private String cor;

    public Sapato() {
    }

    public Sapato(String marca, float preco, String cor) {
        this.marca = marca;
        this.preco = preco;
        this.cor = cor;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
