package Atividades.AtividadePratica37.Model;

public class Pratos extends Base{
    public String nomeDoPrato;
    public Double preco;
    public String descricao;


    @Override
    public boolean equals ( Object obj){
        if (obj instanceof Pratos){
            Pratos outra = (Pratos)obj;
            if(this.id == outra.id){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString(){
        return " ------------ Pratos ---------------------" +
                "\n\tID: " + this.id +
                "\n\\tNome do Prato =  " + this.nomeDoPrato +
                "\n\tPreco = " + this.preco +
                "\n\tDescricao =  " + this.descricao +
                "\n";
    }

}
