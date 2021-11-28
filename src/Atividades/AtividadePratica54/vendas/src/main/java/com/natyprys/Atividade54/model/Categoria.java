package com.natyprys.Atividade54.model;

import jakarta.servlet.http.HttpServlet;

public class Categoria extends HttpServlet {
    private int id;
    private String nome;
    private String descricao;


    //set e get
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


    @Override
    public String toString() {
        String retorno = String.format("%d - %s - %s", this.id, this.nome, this.descricao);
        return retorno;
    }
}

