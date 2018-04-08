//Guilherme Alves Rosa e Silva 201711009
package topico_1;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class Tarefa5 {

    public static void main(String[] args) throws IOException {

        Scanner arq = new Scanner(new FileReader(args[0]));
        FileOutputStream fis = new FileOutputStream(args[1]);
        try (DataOutputStream dis = new DataOutputStream(fis)) {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();

            while (arq.hasNextLine()) {
                byte[] linha = arq.nextLine().getBytes("UTF-8");
                byte[] tamanho = ByteBuffer.allocate(4).putInt(linha.length).array();
                buffer.write(tamanho);
                buffer.write(linha);
            }
            dis.write(buffer.toByteArray());
        }

    }
}
