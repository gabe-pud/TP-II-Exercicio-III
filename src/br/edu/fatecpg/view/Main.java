package br.edu.fatecpg.view;

import br.edu.fatecpg.controller.NoticiaController;
import br.edu.fatecpg.service.NewsService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        NewsService n = new NewsService();
        NoticiaController nc = new NoticiaController();

        String test = n.getNews("bitcoin", 1);
        System.out.println(test);
        // nc.deserialize(test);
        // System.out.println(nc.getNoticias().get(0).toString());

    }
}
