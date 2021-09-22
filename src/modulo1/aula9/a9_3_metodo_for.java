package modulo1.aula9;

import java.util.Scanner;
import java.util.Arrays;

public class a9_3_metodo_for {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double  numeros[] = new double[5];
        for (int i=0; i<5; i++){
            numeros[i] = ler_numero();
        }
        System.out.println(Arrays.toString(numeros));
    }

    static double ler_numero(){
        System.out.println("Digite o valor: ");
        double numero = Double.parseDouble(sc.nextLine());
        return numero;
        // esse numero é uma variavel desse metodo
    }

}


