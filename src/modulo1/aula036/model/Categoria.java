package model;


public class Categoria{
    private int id_categoria;
    private String nome;
    private String descricao;

    public Categoria(String nome) {
        this.nome = nome;
    }
    public Categoria(int id_categoria, String nome,String descricao) {
        this.id_categoria = id_categoria;
        this.nome = nome;
        this.descricao = descricao;
    }


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

    @Override
    public String toString() {
        String retorno = String.format("%d - %s -  %s", this.id_categoria, this.nome, this.descricao);
        return retorno;
    }
}
