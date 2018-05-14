package com.github.guilhermears.es.integracao.topico1;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class EscreveBuffer {

    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    ByteArrayOutputStream buffer2 = new ByteArrayOutputStream();
    byte[] tamIndice;

    Scanner arq;
    String[] args;
    FileOutputStream fis;
    DataOutputStream dis;
    
    /**
     * Construtor recebe o argumento em String[] que recebeu um arquivo de texto.
     *
     * @param args arquivo de entrada
     * @throws java.io.FileNotFoundException
     */
    public EscreveBuffer(String[] args) throws FileNotFoundException {
        this.args = args;
    fis = new FileOutputStream(args[1]);
    dis = new DataOutputStream(fis);
    }

    /**
     * Método lê, linha a linha o arquivo e coloca no buffer o indice
     * seguido da própria até o fim do arquivo. 
     * 
     * @throws java.io.UnsupportedEncodingException
     */
    public void Preenche() throws UnsupportedEncodingException, IOException {
        arq = new Scanner(new FileReader(args[0]));
        int index=0;
        int tamIndex=0;
        while (arq.hasNextLine()) {
            String line = arq.nextLine();
            line = System.getProperty("line.separator")+line;
            byte[] linha = line.getBytes("UTF-8");
            
            index = index + linha.length+4;
            byte[] indice = ByteBuffer.allocate(4).putInt(index).array();
            byte[] tamanho = ByteBuffer.allocate(4).putInt(linha.length).array();
            buffer.write(indice);
            buffer2.write(tamanho);
            buffer2.write(linha);
            tamIndex++;
        }
       tamIndice = ByteBuffer.allocate(4).putInt(tamIndex).array();
        
        
    }
    /**
     * escreve o buffer no arquivo
     * @throws IOException 
     */
    public void EscreveArq() throws IOException{
        dis.write(tamIndice);
        dis.write(buffer.toByteArray());
        dis.write(buffer2.toByteArray());

    }
}