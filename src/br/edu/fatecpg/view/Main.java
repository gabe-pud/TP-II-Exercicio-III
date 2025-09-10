package br.edu.fatecpg.view;

import br.edu.fatecpg.controller.NoticiaController;
import br.edu.fatecpg.service.NewsService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        NewsService n = new NewsService();

        String test = n.getNews("bitcoin", 3);
        //System.out.println(test);
        n.deserialize(test);
        n.getNoticias().forEach(noticia -> System.out.println(noticia.toString()));

    }
}
