package modulo1.aula009;
//Crie um programa em linguagem Java que atenda aos seguintes requisitos:
//_ Leia dois valores do tipo double, digitados pelo usuário.
//_ Realize a chamada para um método que faz a soma entre os dois números e retorna o resultado.
//_ Realize a chamada para um método que faz a subtração entre os dois números e retorna o resultado.
//_ Realize a chamada para um método que faz a multiplicação entre os dois números e retorna o resultado.
//_ Realize a chamada para um método que faz a divisão entre os dois números e retorna o resultado.

import java.util.Scanner;

public class a9_3_AtividadeMétodo {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o primeiro valor: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double n2 = sc.nextDouble();

        System.out.printf("\t\nO valor da soma foi: %f",soma(n1,n2));
        System.out.printf("\t\nO valor da subtração foi: %f",subtracao(n1,n2));
        System.out.printf("\t\nO valor da divisão foi: %f",divisao(n1,n2));
        System.out.printf("\t\nO valor da multiplicação foi: %f",multiplicacao(n1,n2));
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
