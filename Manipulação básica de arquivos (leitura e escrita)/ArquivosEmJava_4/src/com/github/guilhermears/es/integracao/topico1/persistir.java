
package com.github.guilhermears.es.integracao.topico1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class persistir {

    public persistir(){
    }
    
 /**
 * O método recebe como parametro um arquivo e um texto, e persiste este texto
 * no arquivo em UTF-8.
 *
 */
    public void persiste(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
        PrintWriter arq = new PrintWriter(args[0], "UTF-8");
        arq.printf(args[1]);
    }
}
