package modulo1.AtividadePratica21;

public class Conta {
    private double saldo;
    private String codigoCliente;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }


    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void transferencia (double valorTransferencia){
        saldo = saldo - valorTransferencia;
        System.out.printf("\n\tValor transferindo: %.2f", valorTransferencia);
    }

}
