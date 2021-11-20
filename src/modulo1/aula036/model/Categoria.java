package model;

public class Categoria{
    private int id;
    private String nome;
    private String descricao;

    public Categoria(String nome) {
        this.nome = nome;
    }
    public Categoria(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

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
