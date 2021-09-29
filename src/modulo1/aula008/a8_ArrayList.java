package modulo1.aula008;
import java.util.ArrayList;
import java.util.Random;

public class a8_ArrayList {
    public static void main(String[] args) {
        ArrayList sorteados = new ArrayList();
        // para formar um vetor (sorteados) com números sorteados.

        Random random = new Random();
        // para sorteio.

        // O método size() retorna o tamanho de uma lista.
        // O método contains () verifica se uma string contém uma sequência de caracteres. Retorna verdadeiro se os caracteres existem e falso se não existem.
        while(sorteados.size() <10){
            int sorteado = random.nextInt(10);
            if(!sorteados.contains(sorteado)){
                sorteados.add(sorteado);
            }
        }
        System.out.println(sorteados);

        }
    }



