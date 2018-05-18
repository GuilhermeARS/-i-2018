
package com.github.guilhermears.es.integracao.topico2.tarefaJson7;


import java.io.BufferedReader;
import java.io.IOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.net.ssl.HttpsURLConnection;

/**
 * Esta classe possui metodos para instanciar uma conexão e baixar a imagem de perfil
 * 
 */
public class DownloadPerfil {
   private String linkPerfil;
    /**
     * 
     * @param linkPerfil deve receber a url do perfil
     */
    public DownloadPerfil(String linkPerfil){
        this.linkPerfil = linkPerfil;
    }
/**
 * instancia a conexão
 * @return retorna um HttpsURLConnection
 * @throws MalformedURLException
 * @throws IOException 
 */
    public HttpsURLConnection conectaUrl() throws MalformedURLException, IOException  {

            URL link = new URL(linkPerfil);
            HttpsURLConnection connection = (HttpsURLConnection) link.openConnection();
            connection.setRequestMethod("GET");
            connection.setReadTimeout(10000);
            connection.connect();
        return connection;

        }
    /**
     * Obtêm informações da url e grava em arquivo a imagem de perfil com o nome do perfil.
     * @return retorna um boolean se foi baixado com sucesso.
     */
    public boolean downloadAvatar() {
            HttpsURLConnection connection;
        try {
            connection = conectaUrl();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder leitura = new StringBuilder();
            String linha = null;
            while ((linha = buffer.readLine()) != null) {
                leitura.append(linha).append("\n");
            }
            String resultadoTemp = leitura.toString();

            JsonParser parse = new JsonParser();
            JsonObject jo = parse.parse(resultadoTemp).getAsJsonObject();
            String avatar = jo.get("avatar_url").toString().replaceAll("\"", "");
            String nome = jo.get("login").toString().replaceAll("\"", "");

            InputStream is = new URL(avatar).openStream();
            Files.copy(is, Paths.get(nome + ".jpg"));
            return true;
        } catch (IOException ex) {   
            System.out.println(ex.getMessage());
            return false;
    }
    }
}

