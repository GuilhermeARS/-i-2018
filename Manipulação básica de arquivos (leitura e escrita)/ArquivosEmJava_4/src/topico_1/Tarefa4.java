//Guilherme Alves Rosa e Silva 201711009
package topico_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class Tarefa4{
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        try (PrintWriter arq = new PrintWriter(args[0],"UTF-8")) {
            arq.printf(args[1]);
        }
}
}