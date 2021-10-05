package modulo1.aula012;
import java.util.Scanner;

public class CalculadoraTaxas {
    static Scanner sc = new Scanner(System.in);
    private int qtdSaques;

    public double taxa1(double valorTransferido) {
        double taxaTrans = 0.00001;
        return valorTransferido * taxaTrans;
    }

    public double saldoAtual(double taxa1, double saldo, double valorTransferido){
        return saldo - taxa1 - valorTransferido;
    }

    public void saques(int opcaoM, double novoSaldo) {


    }

    //public double taxa2(double novoSaldo,) {
       // qtdSaques++;
       // if (qtdSaques % 5 == 0){
       //     return 1.30;
        //}
        //return 0.0;

}



