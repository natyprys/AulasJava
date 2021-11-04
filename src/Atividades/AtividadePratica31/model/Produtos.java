package modulo1.Atividades.AtividadePratica31.model;


public class Produtos extends base {
    public String nome;
    public Double preco;
    public String descricao;
    public Categorias categorias;  //composicao

    public Produtos() {
        this.categorias = new Categorias();
    }


    @Override
    public boolean equals (Object obj) {
        if (obj instanceof Produtos) {
            Produtos outra = (Produtos)obj;
            if(this.id == outra.id){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString(){
        return  "----------------- Produto -----------------" +
                "\n\tNome = " + this.nome +
                "\n\tPreco = " + this.preco +
                "\n\tDescricao =  " + this.descricao +
                "\n";
    }
}
