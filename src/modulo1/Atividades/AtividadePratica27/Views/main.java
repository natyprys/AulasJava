package modulo1.Atividades.AtividadePratica27.Views;

import modulo1.Atividades.AtividadePratica27.Controller.FilmeController;
import modulo1.Atividades.AtividadePratica27.Controller.SerieController;
import modulo1.Atividades.AtividadePratica27.Models.Filmes;
import modulo1.Atividades.AtividadePratica27.Models.Series;


public class main {
    public static void main(String[] args) {
        FilmeController filmeController = new FilmeController();
        SerieController serieController = new SerieController();

        Filmes filme1 = new Filmes();
        filme1.Id = "1";
        filme1.nome = "A culpa é das estrelas";
        filme1.genero = "Drama";


        Filmes filme2 = new Filmes();
        filme2.Id = "2";
        filme2.nome = "Estraordinário";
        filme2.genero = "Drama";

        Filmes filme3 = new Filmes();
        filme3.Id = "5";
        filme3.nome = "Divertidamente";
        filme3.genero = "Animação";

        Series series1 = new Series();
        series1.Id = "3";
        series1.nome = "This Is Us";
        series1.genero = "Drama";
        series1.episodios = 78 ;
        series1.temporadas = 5;

        Series series2 = new Series();
        series2.Id = "4";
        series2.nome = "Anne with an e";
        series2.genero = "Drama";
        series2.episodios = 25;
        series2.temporadas = 3;


        //criar
        filmeController.create(filme1);
        filmeController.create(filme2);
        serieController.create(series1);
        serieController.create(series2);

        //imprimir
        System.out.println("==================== Filmes ====================");
        System.out.println(filmeController.read());

        System.out.println("==================== Séries ====================");
        System.out.println(serieController.read());

        //deletar
        filmeController.delete(filme2);
        serieController.delete(series1);

        //update
        filmeController.update(filme3);


        //imprimir
        System.out.println("==================== Filmes ====================");
        System.out.println(filmeController.read());

        System.out.println("==================== Séries ====================");
        System.out.println(serieController.read());

    }
}
