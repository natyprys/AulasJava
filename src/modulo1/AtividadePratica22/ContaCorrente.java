package modulo1.AtividadePratica22;

public class ContaCorrente {
    private double saldo;
    private double saldoInicial;
    private double taxaSaque = 1.50;
    private double saques;
    private String codidoCliente;

    public ContaCorrente (double saldo, String codidoCliente){
        this.saldoInicial = saldo;
        this.saldo = saldo;
        this.codidoCliente = codidoCliente;
    }


    public void saque(double valorSaque){
         this.saques =+ valorSaque;
         this.saldo -= (valorSaque + this.taxaSaque);
    }

    public void deposito(double valorDeposito){
        this.saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return  "\nCódigo Cliente: " + this.codidoCliente +"\nSaldo Inicial: " + this.saldoInicial + "\nValor do deposito: 50 " + "\nTotal do saques: "+this.saques + "\nA taxa saque: " + this.taxaSaque +"\nSaldo Final:  " + this.saldo  ;
    }
}
