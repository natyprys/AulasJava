package modulo1.aula020.P1.controller;

import modulo1.aula020.P1.model.Produto;

import java.util.ArrayList;

public class ProdutoController {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public  void salvar(Produto p){
        this.produtos.add(p);
    }

    public ArrayList<Produto> listar(){
        return  produtos;
    }

}
