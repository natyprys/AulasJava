package modulo1.aula014;

public class TelaPrincipalBanco {
    public static void main(String[] args) {

    ContaCorrente cc = new ContaCorrente();

        cc.setAgencia ("Aplolo");
        String n = cc.getAgencia();
        System.out.println("O nome da agencia é: " + n);

        cc.setNumero(24342342);
        int h = cc.getNumero();
        System.out.println("O número é: " + h);

        cc.setCodigo (18);
        int i = cc.getCodigo();
        System.out.println("O codigo é: " + i);

        cc.setValor (2972.83);
        double c = cc.getValor();
        System.out.println("O valor é: " + c);

    }
}
