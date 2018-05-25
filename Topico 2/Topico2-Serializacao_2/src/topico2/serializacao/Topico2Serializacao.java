// Aluno: Guilherme Alves Rosa e Silva
package topico2.serializacao;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Topico2Serializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClasseTeste paraSerializar = new ClasseTeste();
        ClasseTeste Serializado;
        byte[] array = Serializa(paraSerializar);
        System.out.println(Arrays.toString(array));
        Serializado = Deserializa(array);
        System.out.println(Serializado.getTexto());

    }
// Serializa um objeto do tipo ClasseTeste

    public static byte[] Serializa(ClasseTeste pSer) throws IOException {
        ByteArrayOutputStream baoos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baoos)) {
            oos.writeObject(pSer);
            oos.close();
        }

        return baoos.toByteArray();
    }

    // Deserializa um array de bytes retornando um objeto do tipo ClasseTeste
    public static ClasseTeste Deserializa(byte[] array) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(array);
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (ClasseTeste) ois.readObject();
    }

    //Classe a ser serializada
    public static class ClasseTeste implements Serializable {

        private String texto = "deu certo";

        public String getTexto() {
            return texto;
        }

    }

}
