package modulo1.Atividades.AtividadePratica29.Views;

import modulo1.Atividades.AtividadePratica29.Controller.ProdutosController;
import modulo1.Atividades.AtividadePratica29.Models.Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutosController produtosController = new ProdutosController();

        Produtos p1 = new Produtos();
        p1.id = 1;
        p1.nome = "Iphone SE";
        p1.descricao = "2º geração, 64GB";
        p1.preco = 2659.00;
        p1.categorias.smartphone = "Iphone";


        Produtos p2 = new Produtos();
        p2.id = 2;
        p2.nome = " Boneca ";
        p2.descricao = " Sereia ";
        p2.preco = 85.99;
        p2.categorias.brinquedos = "Boneca Barbie ";


        Produtos p3 = new Produtos();
        p3.id = 3;
        p3.nome = " Notebook Gamer Acer ";
        p3.descricao = "Nitro 5";
        p3.preco = 5000.00;
        p3.categorias.computadores = " Notebook i5 ";

        listar(produtosController);

        int opcao;

        do {
            opcao = menu(sc);
            switch (opcao) {
                case 1:
                    System.out.println("------------------ Adicionar ------------------ \n");
                    produtosController.create(p1);
                    produtosController.create(p2);
                    produtosController.create(p3);
                    listar(produtosController);
                    break;

                case 2:
                    System.out.println("------------------ Atualizar ------------------ \n");
                    produtosController.update(p2);
                    listar(produtosController);
                    break;

                case 3:
                    System.out.println("------------------ Deletar ------------------ \n");
                    produtosController.delete(p3);
                    listar(produtosController);
                    break;

                case 4:
                    System.out.println("------------------ Verificar ------------------ \n");
                    produtosController.existe(p1);
                    produtosController.existe(p2);
                    produtosController.existe(p3);
                    listar(produtosController);
                    break;
            }

        } while (opcao != 0);
    }


    private static int menu(Scanner sc) {
        System.out.println("Digite uma das opções abaixo: ");
        System.out.println("\n-------------------MENU---------------------\n" +
                "\n1-Adicionar: " +
                "\n2-Atualizar" +
                "\n3-Deletar" +
                "\n4-Existe  \n");

        int opcao = Integer.parseInt(sc.next());
        return opcao;
    }

    private static void listar ( ProdutosController controller){
        ArrayList<Produtos> lista = controller.listar();
        for(Produtos produtos : lista){
            System.out.print(produtos);
        }
    }
}
