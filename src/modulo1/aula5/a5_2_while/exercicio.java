package modulo1.aula5.a5_2_while;
// Crie um programa em linguagem Java que atenda aos seguintes requisitos:
//_ O programa deve realizar o cadastro de clientes.
//_ O programa deve ter um cabeçalho com o nome do programa.
//_ O programa deve exibir um menu com as opções cadastrar cliente, listar clientes e sair.
//_ Você deve utilizar a estrutura SWITCH-CASE para decidir sobre a opção escolhida pelo usuário.
//_ O cadastro de clientes deve solicitar o nome, sobrenome, rg e cpf.
//_ O nome e sobrenome devem contar no mínimo 3 caracteres.
//_ O rg deve conter no minimo 4 e cpf 11 caracteres.

import java.util.Scanner;

public class exercicio {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ============================ Cadastro de Clientes =========================");
        System.out.println("\t 1 -Cadastrar");
        System.out.println("\t 2 -Listar Clientes");
        System.out.println("\t 0 -Sair");
        System.out.print("\t\n Escolha uma das opções do menu cliente ");

      int escolha = sc.nextInt();
      sc.nextLine();

        switch (escolha){
            case 1:
                System.out.println("Castrar clientes");

                boolean invalido = true;
                String nome = "";
                while (invalido) {
                    System.out.println("Digite o nome do cliente");
                     nome = sc.nextLine();
                    if (nome.length() < 2) {
                        System.out.println("O nome deve ter mais que 2 caracteres");
                    } else {
                        invalido = false;
                    }
                }

                invalido = true;
                String sobrenome = "";
                while (invalido) {
                    System.out.println("Digite o sobrenome do cliente");
                     sobrenome = sc.nextLine();

                    if (sobrenome.length() < 3) {
                        System.out.println("O sobrenome deve ter mais que 2 caracteres");
                        System.out.println("Digite novamente o sobrenome");
                    } else {
                        invalido = false;
                        }
                    }

                invalido = true;
                String CPF = "";
                while (invalido) {
                    System.out.println("Digite o seu CPF");
                    CPF = sc.nextLine();
                    if (CPF.length() < 11) {
                        System.out.println("O CPF deve ter mais que 10 caracteres");
                        System.out.println("Digite novamente o nome");
                    }else {
                        invalido = false;
                        }
                    }

                invalido = true;
                String RG = "";
                while (invalido) {
                    System.out.println("Digite o seu RG");
                    RG = sc.nextLine();
                    if (RG.length() < 7) {
                        System.out.println("O RG deve ter mais que 6 caracteres");
                        System.out.println("Digite novamente o nome");
                        } else {
                        invalido = false;
                        }

                }
                System.out.printf("\t Cadastro realizado com sucesso \n  O nome informado foi: %s \n O sobrenome informado foi: %s \n, O CPF informado foi: %s \n O RG informado foi %s", nome, sobrenome, CPF, RG);
                break;


            case 2:
                System.out.println("Listar clientes");
                break;

            case 0:
                System.out.println("Saindo ...");
                break;

            default:
                System.out.println("Opcao invalida");
                break;
        }




    }
}
