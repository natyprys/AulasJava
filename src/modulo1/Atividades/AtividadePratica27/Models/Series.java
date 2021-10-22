package modulo1.Atividades.AtividadePratica27.Models;

public class Series extends Filmes{
    public int temporadas;
    public int episodios;


    @Override
    public String toString(){
        return " --------------------- Series -------------------" +
                "\n\tID: " + this.Id +
                "\n\tNome: " + this.nome +
                "\n\tGenero: " + this.genero +
                "\n\tTemporadas = " + this.temporadas +
                "\n\tEpisodios = " + this.episodios +
                "\n";
    }

}
