package modulo1.aula7;

public class a6_1_Revisão {
    public static void main (String [] args){
        String nome = "";
        int numero = 10;

        int contador = 0;

        while (contador <= 10){
            // se for falso sai da chave
           System.out.println(contador);
            //contador = contador + 1
            // contador += 1;
            contador ++;

        }
        System.out.println(contador);


        String nome2 = "";
        String sobrenome = "";
        short idade = 0;
        double altura = 1.83;

        System.out.printf("O nome é %s, o sobrenome %s e a idade %d e altura %.2f",
                nome, sobrenome, idade, altura);

        // %s - String
        // %f - pontos flutuantes- float, double
        // %d - Valores inteiros- int, byte, short, long




    }


}
