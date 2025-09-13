package br.edu.fatecpg.view;

import br.edu.fatecpg.service.NewsService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        NewsService n = new NewsService();
        Scanner sc = new Scanner(System.in);

        boolean run = true;

        while (run) {
            System.out.println("O que deseja pesquisar?");
            String pesquisa = sc.next();
            System.out.println("quantas noticias sobre o topico vecê deseja? (max: 100)");
            int qtd = sc.nextInt();

            String noticias = n.searchNews(pesquisa, qtd);
            n.deserialize(noticias);
            n.getNoticias().forEach(noticia -> System.out.println(noticia.toString() + "\n"));

            System.out.println("fazer nova pesquisa? (s/n)");
            String continuar = sc.next();
            if (continuar.toLowerCase().strip().equals("n")) {
                run = false;
            }
        }
    }
}
