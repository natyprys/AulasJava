package AtividadePratica26;

import java.util.Objects;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;

    @Override
    public boolean equals(Object obj) {
        Pessoa outroPessoa = (Pessoa)obj;
        if ( this.nome.equals(outroPessoa.nome) && this.sobrenome.equals(outroPessoa.sobrenome) && this.idade == outroPessoa.idade){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "----------------------Pessoa-----------------------" +
                "\n\tNome = " + this.nome +
                "\n\tsobrenome = " + this.sobrenome  +
                "\n\tidade = " + this.idade + "\n";
    }
}