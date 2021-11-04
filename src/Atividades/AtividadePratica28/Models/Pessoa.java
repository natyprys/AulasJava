package modulo1.Atividades.AtividadePratica28.Models;

public class Pessoa {
    public String nome;
    public Endereco endereco;

    public Pessoa(){
        this.endereco = new Endereco();
    }

    @Override
    public String toString() {
        return "------------------- Pessoa ---------------------" +
                "\n\tNome = " + this.nome +
                "\n\tCEP = " + this.endereco.cep +
                "\n\tEndereço = "+ this.endereco.endereco +
                "\n\tCidade = " + this.endereco.cidade +
                "\n\tEstado =" + this.endereco.estado +
                "\n";
    }
}

