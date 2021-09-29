
// Procedimentos, funções e Métodos
// SRP_ Single Responsability Principle - Principio da responsabilidade unica

package modulo1.aula009;

import java.util.Scanner;

public class a9_1_metodos {
    static Scanner sc = new Scanner(System.in);

    public static void main (String []args ){
        cabecalho();
        imprime_menu();
        escolha_menu();
    }

        static void cabecalho(){
            // void não retorna nada
            System.out.println("======== Calculadora =========");
        }

        static void imprime_menu (){
            System.out.println("Menu");
            System.out.println("\t 1-Soma");
            System.out.println("\t 2-Subtração");
            System.out.println("\t 3- Divisão");
            System.out.println("\t 4-Multiplicação");
            System.out.println("\t 0-Sair");
        }


        static void escolha_menu() {
            int op = ler_numero ("Digite uma opção do menu");
            int n1 = 0, n2 = 0, r = 0;

            if(op > 0){
                n1= ler_numero ("Digite o primeiro numero");
                n2= ler_numero ("Digite o segundo numero");
            }

            switch (op) {
                case 1: // soma
                    r = soma(n1,n2);
                    break;

                case 2: // subtração
                    r = subtracao(n1,n2);
                    break;

                case 3: // divisão
                    r = divisao(n1,n2);
                    break;

                case 4: // multiplicação
                    r = multiplicacao(n1,n2);
                    break;

                case 0: // sair
                    return;
            }
            System.out.printf("O resultado da operação é %d :", r);

            }

    static int ler_numero(String mensagem) {
        System.out.print(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }

    // operações
    static int soma (int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    static int subtracao (int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }
    static int divisao (int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }
    static int multiplicacao (int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }

    }


//funções retornam algo
//metodos estão dentro de uma classe
// quando tenho um metodo tem a forma:
// soma (){ }