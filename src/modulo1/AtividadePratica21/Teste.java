package modulo1.AtividadePratica21;

public class Teste {
    public static void main(String[] args) {

        Conta c1 = new Conta();

        c1.setSaldo(1500);
        c1.transferencia(150);
        System.out.printf("\n\tSaldo após a tranferência: %.2f\n",c1.getSaldo());

        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(1200);
        cc.transferencia(300);
        System.out.printf("\n\tSaldo após tranferência Conta Corrente: %.2f\n",cc.getSaldo());

    }
}
