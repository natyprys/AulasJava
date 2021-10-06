package modulo1.aula015.P2;

public class Conta {
    private double saldo;

    public void transferencia(double valorTransferencia){
        saldo -= valorTransferencia;
        System.out.printf("\n\tTransferindo %.2f", valorTransferencia);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
}
