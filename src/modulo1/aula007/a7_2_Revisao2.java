package modulo1.aula007;

public class a7_2_Revisao2 {
    public static void main (String [] args){
        String nome = "";
        boolean dado_valido = false;
        do {
            System.out.println("Digite nome: ");
            nome = "Ma";
            if (nome.length() < 3) {
                System.out.println("Xovem, erastes");
                dado_valido = true;
            }
        }while (dado_valido);
        // while é um bloco de codigo de validação
        // while (!dado_valido) para inverter o valor de while


    }
}
