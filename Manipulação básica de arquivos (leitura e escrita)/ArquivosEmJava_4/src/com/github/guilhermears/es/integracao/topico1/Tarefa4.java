//Guilherme Alves Rosa e Silva 201711009
package com.github.guilhermears.es.integracao.topico1;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;


/**
 * a classe recebe como parametro um arquivo e um texto, e persiste este texto
 * no arquivo em UTF-8.
 *
 */
public class Tarefa4 {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Persistir persistir = new Persistir();
        persistir.persiste(args);
    }
}
