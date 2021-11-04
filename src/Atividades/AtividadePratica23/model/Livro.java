package Atividades.AtividadePratica23.model;

import Atividades.AtividadePratica29.Models.Produtos;

public class Livro extends Base {
    private String nome;
    private String descricao;
    private int numPag;

    public Livro(String nome, String descricao, int numPag, int Id) {
       this.nome = nome;
       this.descricao = descricao;
       this.numPag = numPag;
       this.Id = Id;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public int getNumPag() {
        return numPag;
    }
    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }


    //reescrevendo o equals
    //ao reescrever observe a sobrescrita, pois deve seguir o padrão já estabelecidos na mãe

    @Override
    public boolean equals(Object obj){
        Livro outro = (Livro)obj;

        //para comparar os Ids
        if(this.Id == outro.Id){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "\n---------------------- Livros ------------------------\n" +
                "\tID: " + this.Id +
                "\tNome: " + this.nome+
                "\tNúmero de Páginas: " + this.numPag+
                "\tDescrição: " + this.descricao+
                "\n";
    }

}


