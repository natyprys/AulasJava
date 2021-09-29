package modulo1.aula008;
//Crie um programa em linguagem Java que atenda aos seguintes requisitos:
//_ Imprima todos o números pares até 100 utilizando o laço FOR.
//_ Imprima todos os números primos até 150 utilizando o laço FOR.

import java.util.Scanner;

public class a8_NumPrimoImpar {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int valor1 =100;
        int valor2 = 150;

        for (int i = 1; i <= valor1; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("----------------------------------------------------------------------------------");

        for (int i=0 ; i<= valor2; i++){
            boolean primo = true;
            for( int numero = 2; numero<i ;numero ++)
                if ( i % numero == 0) {
                    primo = false;
                }
            if (primo){
                System.out.println(i);
            }

        }

    }
}

