package modulo1;

public class a4 {
    public static void main(String[] args) {
        
    // numeros com casa decimal 
    //float- Single Precision = 32bits = 1 sinal - 8 expoents 23 precisao

    float minF = Float.MIN_VALUE;
    float maxF = Float.MAX_VALUE;
    System.out.println(minF);
    System.out.println(maxF);

    //double - Double Precision = 1 sinal - 11 expoent 52 precisao
    System.out.println("------------------------------------------------------------");
    double minD = Double.MIN_VALUE;
    double maxD = Double.MAX_VALUE;
    System.out.println(minD);
    System.out.println(maxD);

    System.out.println("------------------------------------------------------------");
    float salario = 1998.89f;
    // double sal1 = 1998.89;

    //Conversao implicita
    double valor = 8888.88f;
    double valor2 = salario;

    System.out.println(salario);
    System.out.println(valor2);
}
}
