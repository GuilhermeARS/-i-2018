package topico2.serializacao;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Topico2Serializacao {

    public static void main(String[] args) throws IOException {
        Serializada teste = new Serializada();

        try (ObjectOutputStream oos = new ObjectOutputStream(new ByteArrayOutputStream())) {
            oos.writeObject(teste);
        }

    }

    public static class Serializada {

        String texto = "testa ae";
    }

}
