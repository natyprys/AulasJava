package modulo1.aula4;
//Crie um programa em linguagem Java que atenda aos seguintes requisitos:
// _ O programa deve realizar o filmes, series e documentarios
// _ O programa deve ter um cabeçalho com o nome do programa.
// _ O programa deve exibir um menu com as opções cadastrar filme, cadastrar serie, cadastrar documentario e sair.
// _ Você deve utilizar a estrutura SWITCH-CASE para decidir sobre a opção escolhida pelo usuário.
// _ O cadastro de filmes deve conter nome, descrição, genero e ano de lançamento.
// _ O cadastro de serie deve conter o nome, ano de lançamento e produtora.
// _ O cadastro de documentario deve conter o nome, ano de lançamento e tema.


import java.util.Scanner;

public class a4_4_SwitchExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ====================== Cadastro filme/serie/documentario =========================");
        System.out.println("Seja Bem-Vindo (a)! \n ");
        System.out.println("\t 0 -Filme");
        System.out.println("\t 1 -Serie");
        System.out.println("\t 2 -Documentário");
        System.out.println("\t \n Escolha uma opção do programa");

        int programa = sc.nextInt();

        switch (programa) {
            case 0:
                System.out.println("Qual o nome do filme?");
                String filme = sc.next();
                System.out.println("Faça uma descrição do filme");
                String descricaoFilme = sc.nextLine();
                System.out.println("Qual o gênero do filme");
                String genero = sc.next();
                System.out.println("Qual o ano de lançamento do filme");
                int anoFilme = sc.nextInt();
                sc.nextLine();

                break;

            case 1:
                System.out.println("Qual o nome da serie?");
                String serie = sc.next();
                System.out.println("Qual o ano de lançamento da serie");
                int anoSerie = sc.nextInt();
                sc.nextLine();
                System.out.println("Qual o nome da produtora da serie?");
                String ProdutoraSerie = sc.next();

                break;

            case 2:
                System.out.println("Qual o nome da documentário?");
                String documentario = sc.next();
                System.out.println("Qual o ano de lançamento do documentario?");
                int anoDocumentario = sc.nextInt();
                sc.nextLine();
                System.out.println("Qual o tema do documentario?");
                String Tema = sc.next();

                break;

            default:
                System.out.println(" ");
                break;
        }

        System.out.println(" ====================== Fim de Cadastro filme/serie/documentario =========================");
    }
}

