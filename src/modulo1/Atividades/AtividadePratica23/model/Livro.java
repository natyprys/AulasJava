package modulo1.Atividades.AtividadePratica23.model;

public class Livro {
    private String nome;
    private String descricao;
    private int numPag;
    private int id;

    public Livro(int id){
        this.id = id;
    }
    public int getId() {
        return id;
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
        if(this.id == outro.id){
            return true;
        }else{
            return false;
        }

    }



}


