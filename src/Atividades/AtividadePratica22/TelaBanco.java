package AtividadePratica22;

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000, "007299124");

        cc.saque(160);
        cc.deposito(50);

        System.out.println(cc);
    }

}
