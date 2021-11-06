package Atividades.AtividadePratica37.View;

import Atividades.AtividadePratica37.Controller.PratosController;
import Atividades.AtividadePratica37.Model.Pratos;

public class Main {
    public static void main(String[] args) {
        PratosController pc = new PratosController();

        Pratos p1 = new Pratos();
        p1.id= 001;
        p1.nomeDoPrato= "Parmegiana ";
        p1.descricao = "Prato italiano feito com berinjela  ";
        p1.preco = 50.00;

        Pratos p2 = new Pratos();
        p2.id= 002;
        p2.nomeDoPrato= " Feijoada ";
        p2.descricao = "  ";
        p2.preco = 20.00;

        Pratos p3 = new Pratos();
        p3.id= 003;
        p3.nomeDoPrato= " Strogonoff ";
        p3.descricao = "  ";
        p3.preco = 13.00;

        // adicionando pratos
        pc.create(p1);
        pc.create(p2);
        pc.create(p3);


        //Tamanho
        pc.numeroItens();


        //Ler dados
        pc.read();


        //Deletar prato
        pc.delete(p1);


        //Ler dados
        pc.read();


    }

}
