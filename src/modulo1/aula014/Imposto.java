package modulo1.aula014;

import modulo1.aula014.CalculadoraImposto;

import java.util.Scanner;

public class Imposto {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o valor para base do calculo do imposto \n");
        double valor = sc.nextDouble();

        CalculadoraImposto calc = new CalculadoraImposto();

        double taxaISS = calc.calculoISS(valor);
        double taxaIOF = calc.calculoIOF(valor);
        double taxaIR = calc.calculoIR(valor);

        System.out.print( "==========================================================");
        System.out.printf("\tO valor informado foi: %f.\n\tO valor do imposto calculado foi:\n\tISS: %f.\n\tIOF: %f\n\tIR: %f",valor,taxaISS,taxaIOF,taxaIR);

    }
}
