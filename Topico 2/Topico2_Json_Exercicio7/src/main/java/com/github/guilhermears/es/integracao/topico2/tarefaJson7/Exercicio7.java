package com.github.guilhermears.es.integracao.topico2.tarefaJson7;

/**
 * instancia uma classe do DownloadPerfil, e executa o método Download avatar,
 * então exibe se foi um sucesso ou não.
 *
 */
public class Exercicio7 {

    public static void main(String[] args) {
        DownloadPerfil baixar = new DownloadPerfil(args[0]);
        boolean status = baixar.downloadAvatar();
        if (status) {
            System.out.println("A imagem de perfil foi baixada com sucesso.");
        } else {
            System.out.println("A imagem de perfil não foi baixada.");
        }

    }

}
