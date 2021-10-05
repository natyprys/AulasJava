package modulo1.aula011;

public class Calculadora {
    int n1;
    int n2;
    String nome;

     int somar (int n1, int n2){
        int s= n1 + n2;
        return s;
    }
     int subtrair (int n1, int n2) {
        int s = n1 - n2;
        return s;
    }
     int multiplicar (int n1, int n2) {
        int s = n1 * n2;
        return s;
    }
    int dividir (int n1, int n2) {
        int s = n1 / n2;
        return s;
    }
// não foi colocado static, pois vamos chamar de dentro de um objeto.
// quando temos o static posso chamar direto da clase.

}
