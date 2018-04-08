//Guilherme Alves Rosa e Silva 201711009
package topico_1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Tarefa1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int valor;
        try (DataInputStream dis = new DataInputStream(fis)) {
            valor = dis.readInt();
        }
        System.out.printf("%X",valor);

    }
    
}
