package modulo1.aula008;
//Crie um programa em linguagem Java que atenda aos seguintes requisitos:
//_ Calcule o retorno total de um investimento de R$ 5.000,00 durante 24 meses a uma taxa de juros de 2% ao mês. Utilize o laço FOR para imprimir o valor do retorno mês a mês.

public class a8_3_Investimento {
    public static void main(String[] args){
        double investimento = 5000;
        double invest2 = investimento;

        for(int mes =1; mes< 25; mes ++){
            invest2 = (invest2 * 0.02 + invest2);
            System.out.printf("Mes %d: %2f \n",mes,invest2);
        }

    }


}
