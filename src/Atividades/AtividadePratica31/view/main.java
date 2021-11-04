package modulo1.Atividades.AtividadePratica31.view;

import modulo1.Atividades.AtividadePratica31.controller.ProdutoController;
import modulo1.Atividades.AtividadePratica31.model.Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        ProdutoController produtoController = new ProdutoController();

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

        listar(produtoController);
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

        private static void listar(ProdutoController controller){
            ArrayList<Produtos> lista = controller.listar();
            for ( Produtos produtos : lista){
                System.out.print(produtos);
            }
        }


    }


