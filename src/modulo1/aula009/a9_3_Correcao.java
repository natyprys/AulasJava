package modulo1.aula009;

import java.util.Scanner;

class a9_3_correcao {


        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            double num1, num2;
            num1 = ler_numero();
            num2 = ler_numero();
            double r_soma = soma(num1, num2);
            double r_subtracao = subtracao(num1, num2);
            double r_divisao = divisao(num1, num2);
            double r_multiplicacao = multiplicacao(num1, num2);

            imprimir_resultado("soma", r_soma);
            imprimir_resultado("subtração", r_subtracao);
            imprimir_resultado("divisão", r_divisao);
            imprimir_resultado("multiplicação", r_multiplicacao);
                // armazenou (String, Double)

        }

        static double ler_numero(){
            System.out.println("Digite o valor: ");
            double numero = Double.parseDouble(sc.nextLine());
            return numero;
            // esse numero é uma variavel desse metodo
        }

        static void imprimir_resultado(String nome_operacao, double resultado){
            System.out.printf("\t\nO valor da %s é %.2f",nome_operacao, resultado);

        }

        static double soma (double n1, double n2) {
            return n1 + n2;
        }

        static double subtracao (double n1, double n2) {
            return n1 - n2;
        }

        static double divisao (double n1, double n2) {
            return n1 / n2;
        }

        static double multiplicacao (double n1, double n2) {
            return n1*n2;
         }

}
