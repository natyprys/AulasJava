package com.natyprys.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//para dizer que se trata de uma tabela do banco de dados

//tenho q linkar com a minha tabela, preciso mostrar que a tabela tem um nome diferente da classe
@Table(name= "categoria")

public class Categoria {
    //para resolver o problema da Primary Key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_categoria;
    private String nome;
    private String descricao;

    public void setId(int id) {
        this.id_categoria = id;
    }
    public int getId() {
        return id_categoria;
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

}
