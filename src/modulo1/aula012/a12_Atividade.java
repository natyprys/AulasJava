package modulo1.aula012;

import java.util.Scanner;

public class a12_Atividade {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o saldo atual da sua conta: \n");
        double saldo = sc.nextDouble();
        System.out.println("Digite o valor que será transferido");
        double valorTransferido = sc.nextDouble();

        CalculadoraTaxas calc = new CalculadoraTaxas();

        double taxa1 = calc.taxa1(valorTransferido);
        double novoSaldo = calc.saldoAtual(saldo, taxa1, valorTransferido);


        int opcaoM = opcoesMenu();
        double saque = calc.saques(opcaoM, novoSaldo);
        double taxa2 = calc.taxa2(novoSaldo);
        double valorFinal = saldo - taxa1 - taxa2;


        imprimir();

    }


    static void imprimir() {
        System.out.printf(" Saldo inicial: %f.\n Valor transferido: %f.\n Taxa sobre o valor transferido: %f.\n Saldo após a transferência: %f.\n");
        System.out.printf(" A taxa sobre cada saque foi de: %f.\n O valor final na sua conta é de: %f\n");
    }

    static int opcoesMenu() {
        System.out.println("Deseja realizar um saque? 1- Sim , 2-Não");
        int opcao = sc.nextShort();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Realizar saque");

            case 2:
                System.out.print("O saque não será realizado");

            default:
                System.out.println("Tipo de opção inválida. Sair");

        }
    return opcao;

    }
}
