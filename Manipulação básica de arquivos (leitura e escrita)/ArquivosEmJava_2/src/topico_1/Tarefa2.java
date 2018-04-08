//Guilherme Alves Rosa e Silva 201711009
package topico_1;

import java.io.*;


public class Tarefa2 {


    public static void main(String[] args) throws IOException {

        boolean eJpeg = verificacaoJpeg(args[0]);
        if (eJpeg == true){
        System.out.println("É um jpeg");
    
        } else System.out.println("Não é um jpeg");
    }
    
  
    public static boolean verificacaoJpeg(String arquivo) throws FileNotFoundException, IOException {
        
        File arc = new File(arquivo);
        long tamanho = arc.length();
        
        
        FileInputStream fis = new FileInputStream(arquivo);
        byte ff;
        byte d8;
        byte ff2;
        byte d9;
        try (DataInputStream dis = new DataInputStream(fis)) {
            ff = dis.readByte();
            d8 = dis.readByte();
            long skip = dis.skip(tamanho - 4);
            ff2 = dis.readByte();
            d9 = dis.readByte();
        }
        
        
        boolean teste = ff == (byte) 0xFF || d8 == (byte) 0xD8 || ff2 == (byte) 0xFF || d9 == (byte) 0xD9;
        
        return teste;
    }
}
