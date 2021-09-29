package modulo1.aula001;

import java.util.Scanner;

public class a1_console {
    public static void main (String args[]){
        Scanner scanner = new Scanner((System.in));

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        //ln serve para pular a linha
        // System.out.print("Tchau");
        //escreve em sequencia

        System.out.println("Digite seu sobrenome:  ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:  ");
        int idade = scanner.nextInt();

        System.out.println("O nome e o sobrenome digitado foi:  " + nome +"  "+ sobrenome);
    }
}


