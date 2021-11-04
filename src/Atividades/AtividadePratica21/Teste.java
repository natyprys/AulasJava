package modulo1.Atividades.AtividadePratica21;

public class Teste {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        System.out.println("------------------------------------ Conta -------------------------------------------- ");
        c1.setSaldo(1500);
        c1.transferencia(150);
        c1.setCodigoCliente("0043178");
        System.out.printf("\n\tCódigo do Cliente: " + c1.getCodigoCliente());
        System.out.printf("\n\tSaldo após a tranferência: %.2f\n\n",c1.getSaldo());


        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(1200);

        System.out.println("--------------------------- Conta Corrente- Transf 1 -------------------------------------");
        cc.transferencia(10);
        System.out.printf("\n\tSaldo após tranferência Conta Corrente: %.2f\n\n",cc.getSaldo());


        System.out.println("--------------------------- Conta Corrente- Transf 2 -------------------------------------");
        cc.transferencia(5);
        System.out.printf("\n\tSaldo após tranferência - Conta Corrente: %.2f\n\n",cc.getSaldo());


        System.out.println("--------------------------- Conta Corrente- Transf 3 -------------------------------------");
        cc.transferencia(15);
        System.out.printf("\n\tSaldo após tranferência - Conta Corrente: %.2f\n\n",cc.getSaldo());


        System.out.println("--------------------------- Conta Corrente- Transf 4 -------------------------------------");
        cc.transferencia(20);
        System.out.printf("\n\tSaldo após tranferência - Conta Corrente: %.2f\n\n",cc.getSaldo());


        System.out.println("--------------------------- Conta Corrente- Transf 5 -------------------------------------");
        cc.transferencia(30);
        System.out.printf("\n\tSaldo após tranferência - Conta Corrente: %.2f\n\n",cc.getSaldo());


        System.out.println("--------------------------- Conta Corrente- Transf 6 -------------------------------------");
        cc.transferencia(50);
        System.out.printf("\n\tSaldo após tranferência - Conta Corrente: %.2f\n\n",cc.getSaldo());
    }


}
