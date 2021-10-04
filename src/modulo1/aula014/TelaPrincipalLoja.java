package modulo1.aula014;

public class TelaPrincipalLoja {
    public static void main(String[] args) {
        Produto p = new Produto();

        p.setNome ("Atitude Y");
        String x = p.getNome();
        System.out.println("O nome da loja é:" + x);

        p.setDescricao ("Loja de sapatos");
        String n = p.getDescricao();
        System.out.println("A descrição da loja é:" + n);

        p.setCodigo (342318);
        int i = p.getCodigo();
        System.out.println("O codigo da loja é:" + i);

        p.setValor (2972.83);
        double c = p.getValor();
        System.out.println("O valor é:" + c);



    }
}
