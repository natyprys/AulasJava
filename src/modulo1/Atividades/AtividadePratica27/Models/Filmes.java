package modulo1.Atividades.AtividadePratica27.Models;

import java.util.Objects;

public class Filmes {
    public String Id;
    public String nome;
    public String genero;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Filmes) {
            Filmes outro = (Filmes) obj;
            if (this.Id == outro.Id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "---------------- Filme ----------------"+
                "\n\tID: " + this.Id +
                "\n\tNome: " + this.nome +
                "\n\tGenero: " + this.genero+
                "\n";
    }
}