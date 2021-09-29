package modulo1.aula008;
//Crie um programa em linguagem Java que atenda aos seguintes requisitos:
//_ Armazene o seu nome completo em duas variáveis, nome e sobrenome
//_ Imprima seu nome 10 vezes no terminal com a função PRINTF usando o laço de repetição while utilizando uma variável contadora.
//_ Recrie o passo anterior feito com WHILE agora com o laço FOR.


import java.util.Scanner;

public class a8_RevisaoFor {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = sc.nextLine();

        int valor= 10;

        for (int i=1; i<= valor; i++){
            System.out.printf("\nO nome informado foi: %s,\no sobrenome informado foi: %s \n", nome,sobrenome);
        }

    }
}
