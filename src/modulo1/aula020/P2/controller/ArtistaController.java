package modulo1.aula020.P2.controller;

import modulo1.aula020.P2.model.Artista;

import java.util.ArrayList;

public class ArtistaController {
    private ArrayList<Artista> artistas = new ArrayList<Artista>();

    public void salvar(Artista a){
        artistas.add(a);
    }

    public ArrayList<Artista> listar(){
        return artistas;
    }
}
