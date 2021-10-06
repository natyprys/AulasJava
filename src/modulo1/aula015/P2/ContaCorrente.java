package modulo1.aula015.P2;

public class ContaCorrente extends Conta {

    @Override
    public void transferencia(double valorTransferencia) {
        super.transferencia(valorTransferencia);
        double taxaTransferencia = 10;
        double novoSaldo =  this.getSaldo() - taxaTransferencia;
        this.setSaldo(novoSaldo);
    }
}
