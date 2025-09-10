package br.edu.fatecpg.controller;

import br.edu.fatecpg.model.Noticia;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class NoticiaController {
    List<Noticia> noticias = new ArrayList<>();

    public void deserialize(String response){
        Gson gson = new Gson();
        Noticia n = gson.fromJson(response, Noticia.class);
        noticias.add(n);
    }

    public List<Noticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<Noticia> noticias) {
        this.noticias = noticias;
    }
}
