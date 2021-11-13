package AtividadePratica23.view;

import AtividadePratica23.controller.LivroController;
import AtividadePratica23.model.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class LivroView {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LivroController controller = new LivroController();
        int opcao;

        do {
            opcao = menu(sc);
            switch (opcao) {
                case 1:
                    System.out.println("---------------- Cadastrar --------------------");
                    cadastrar(controller, sc);
                    break;

                case 2:
                    System.out.println("----------------- Listar  ---------------------");
                    listar(controller);
                    break;

                case 3:
                    System.out.println("---------------- Alterar ---------------------");
                    Livro livro1 = new Livro("A revolução dos bichos", "distopia", 100, 1);
                    controller.alterar(livro1);
                    break;

                case 4:
                    System.out.println("---------------- Deletar --------------------");
                    Livro livro2 = new Livro("O Sol é para todos", "Drama", 400, 2);
                    controller.deletar(livro2);
                    break;

                default:
                    break;
            }

        } while (opcao != 0);
    }


    private static int menu(Scanner sc) {
        System.out.print("Escolha uma opção: \n\t1-Cadastrar  \n\t2-Listar  \n\t3-Alterar  \n\t4-Deletar ");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }



    private static void cadastrar(LivroController controller, Scanner sc) {
        System.out.println("Digite o nome do livro: ");
        String nome = sc.nextLine();

        System.out.println("Digite a descrição do livro: ");
        String descricao = sc.nextLine();

        System.out.println("Digite o número de páginas do livro: ");
        int Numpag = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o Id do livro");
        int Id = sc.nextInt();
        sc.nextLine();


        Livro livro = new Livro(nome,descricao,Numpag,Id);
        controller.salvar(livro);

        System.out.println( "\nLivro Salvo \n");
    }


    private static void listar(LivroController controller) {
        ArrayList<Livro> lista = controller.listar();
        for (Livro livro : lista) {
            System.out.printf("\n\tNome: %s \n\tDescrição: %s \n\tNúmero de páginas: %f \n", livro.getNome(), livro.getDescricao(), livro.getNumPag(), livro.getId());
        }
    }


}