package modulo1.Atividades.AtividadePratica21;

public class ContaCorrente extends Conta {
    private double taxaTransferencia = 2.50;
    private double taxaManutencao = 10.50;
    private int numTransferencias = 0;

    @Override
    public void transferencia (double valorTransferencia) {
        super.transferencia (valorTransferencia);
        double novoSaldo = getSaldo() - taxaTransferencia;
        this.setSaldo(novoSaldo);

        numTransferencias ++;
        if (numTransferencias % 5 == 0) {
            double saldoTrans = this.getSaldo() - taxaManutencao;
            this.setSaldo(saldoTrans);
            }

        }

    }
