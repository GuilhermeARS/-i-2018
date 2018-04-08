//Guilherme Alves Rosa e Silva 201711009
package topico_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Tarefa3 {

        public static void main(String[] args) throws FileNotFoundException, IOException {
            byte[] conteudo;
            try (FileInputStream fis = new FileInputStream(args[0])) {
                conteudo = new byte[(int) args[0].length()];
                fis.read(conteudo);
            }
        
        
        String str = new String(conteudo, "UTF-8");

        System.out.println(str);
    }
    
}

    







