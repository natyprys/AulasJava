package modulo1.Atividades.AtividadePratica23.view;

import modulo1.Atividades.AtividadePratica23.controller.LivroController;
import modulo1.Atividades.AtividadePratica23.model.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class LivroView {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LivroController controller = new LivroController();

        int opcao;

        do {
            opcao = menu (sc);
            switch (opcao){
                case 1:
                    cadastrar (controller,sc);
                    break;

                case 2:
                    listar (controller);
                    break;

                case 3:

                    break;

                case 4:

                    break;
            }

        }while (opcao !=0);
    }


    private static void cadastrar (LivroController controller, Scanner sc){

    }


    private static void  listar (LivroController controller){
        ArrayList<Livro> lista = controller.listar();
        for (Livro livro : lista){
            System.out.printf("\n\tNome: %s \n\tDescrição: %s \n\tNúmero de páginas: %f \n", livro.getNome(), livro.getDescricao(), livro.getNumPag());
        }
    }


    private static int menu(Scanner sc){
        System.out.print("\t1-Cadastrar  \n\t2-Listar  \n\t3-        \n\t4-        0-Sair\n\n\tEscolha uma opção:");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
        }

}
