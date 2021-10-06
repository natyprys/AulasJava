package modulo1.AtividadePratica21;

public class ContaCorrente extends Conta {
    private double taxaTransferencia = 2.50;
    private double taxaManutencao = 10.50;
    private int numTransferencias = 0;

    @Override
    public void transferencia(double valorTransferencia) {
        super.transferencia(valorTransferencia);
        double novoSaldo = this.getSaldo() - taxaTransferencia;
        this.setSaldo(novoSaldo);
    }


}
