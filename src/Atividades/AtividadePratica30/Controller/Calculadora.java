package AtividadePratica30.Controller;

import AtividadePratica30.Models.Operacoes;

import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);


    public static void cabecalho(){
        System.out.println("\n-------------- Calculadora -----------------");
    }

    public static void imprime_menu(){
        System.out.println("\n------------------- Menu ----------------- \n");
        System.out.println("\t 1-Soma");
        System.out.println("\t 2-Subtração");
        System.out.println("\t 3- Divisão");
        System.out.println("\t 4-Multiplicação");
        System.out.println("\t 0-Sair");
    }

    public static void escolha_menu() {

        int op = ler_menu("\nDigite uma opção do menu: \n");
        int n1 = 0, n2 = 0, r = 0;
        n1 = ler_numero("Digite o primeiro numero: \n");

        boolean continuar;
        do {
            try {
                n2 = ler_numero("Digite o segundo numero: \n");
                    continuar = true;

                if (op == 3 && n2 == 0) {
                    throw new ArithmeticException("A divisão não permite zero no divisor.");
                }

            }catch ( ArithmeticException ex) {
                System.out.println(ex.getMessage() + "Digite Novamente");
                continuar = false;
            }
        }while (!continuar);

//ArithmeticException
//Este tipo de exceção ocorre quando alguma operação aritmética é inválida e a mesma gera uma exceção, operações essas que não podem ser resolvidas, como é o caso da divisão por zero.

    Operacoes operacoes = new Operacoes();
        switch (op) {
        case 1:
            System.out.println("\n--------- Soma -----------\n");
            r = operacoes.soma(n1, n2);
            break;

        case 2:
            System.out.println("\n--------- Subtração -----------\n");
            r = operacoes.subtracao(n1, n2);
            break;

        case 3:
            System.out.println("\n--------- Divisão -----------\n");
            r = operacoes.divisao(n1, n2);
            break;

        case 4:
            System.out.println("\n--------- Multiplicação -----------\n");
            r = operacoes.multiplicacao(n1, n2);
            break;
    }
        System.out.printf("O resultado da operação é: %d", r);
    }

    private static int ler_menu (String mensagem){
        int opcao = 0;
        boolean valido;
        do {
            try {
                System.out.print(mensagem);
                 opcao = Integer.parseInt(sc.nextLine());
                 valido = true;

                if (opcao <= 0 || opcao >= 5) {
                    throw new IllegalArgumentException("Opção escolhida fora do menu.\n");
                    }

            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage() + "Digite Novamente\n");
                valido = false;

            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage() + "Digite Novamente\n");
                valido = false;
            }

        } while (!valido);
          return opcao;
    }


// Coloco parametro??
//IllegalArgumentException
//Este tipo exceção geralmente é utilizada para validar valores de parâmetros que não estão nas condições adequadas ao programa.

// NumberFormatException
// n coloco parametro
//Um NumberFormatException é o modo como o Java tem que dizer "Eu tentei converter um String em int e não consegui fazê-lo".


    private static int ler_numero (String mensagem){
        int num =0;
        boolean valido;

        do {
            try {
                System.out.print(mensagem);
                num = Integer.parseInt(sc.nextLine());
                valido = true;

                if (num < 0) {
                    throw new IllegalArgumentException("Não vamos utilizar números negativos nessa calculadora");
                }

            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage() + "Digite Novamente");
                valido = false;

            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage() + "Digite Novamente");
                valido = false;
            }

        } while (!valido);
        return num;
    }
}


