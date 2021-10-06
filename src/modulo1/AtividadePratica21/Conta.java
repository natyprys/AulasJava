package modulo1.AtividadePratica21;

public class Conta {
    private double saldo;
    private double codigoCliente;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }


    public void setCodigoCliente(double codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public double getCodigoCliente() {
        return codigoCliente;
    }

    public void transferencia (double valorTransferencia){
        saldo -= valorTransferencia;
        System.out.printf("\n\tValor transferindo: %.2f", valorTransferencia);
    }
}
