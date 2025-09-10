package br.edu.fatecpg.service;

import br.edu.fatecpg.controller.NoticiaController;
import br.edu.fatecpg.model.Noticia;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class NewsService {
    NoticiaController noticias;

    public String getNews(String search, int qtd) throws InterruptedException, IOException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://newsapi.org/v2/everything?q="+search+"&pageSize="+qtd+"&apiKey="+System.getenv("API_KEY"))).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public void deserialize(String response){
        Gson gson = new Gson();
        NoticiaController n = gson.fromJson(response, NoticiaController.class);
        noticias = n;
    }

    public List<Noticia> getNoticias() {
        return noticias.getNoticias();
    }

    public void setNoticias(NoticiaController noticias) {
        this.noticias = noticias;
    }
}
