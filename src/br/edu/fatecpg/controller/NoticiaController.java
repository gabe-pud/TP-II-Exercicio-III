package br.edu.fatecpg.controller;

import br.edu.fatecpg.model.Noticia;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class NoticiaController {
    String status;
    String totalResults;
    @SerializedName("articles")
    List<Noticia> noticias = new ArrayList<>();

    public List<Noticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<Noticia> noticias) {
        this.noticias = noticias;
    }
}
