package modulo1.aula008;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayPrimos {
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            ArrayList sorteados = new ArrayList();

            int valor2 = 50;

            while (sorteados.size() < valor2) {
                  Random random = new Random();
                  int sorteado = random.nextInt(valor2);
                  if (!sorteados.contains(sorteado)) {
                        sorteados.add(sorteado);
                        for (sorteado=0 ; sorteado <= valor2; sorteado++) {
                              boolean primo = true;
                              for (int numero = 0; numero < sorteado; numero++)
                                    if (sorteado % numero == 0) {
                                          primo = false;
                                    }
                              if (primo) {
                                    System.out.println(sorteado);
                              }
                              //for (sorteado =0 ; sorteado<= valor2; sorteado++){
                              // boolean primo = true;
                              // for( int numero = 0; numero < sorteado ;numero ++)
                              // if ( sorteado % numero == 0) {
                              // primo = false;
                              // }
                              // if (primo){
                              // System.out.println(sorteado);


                        }
                        System.out.println(sorteados);
                  }
            }
      }
}














