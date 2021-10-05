package modulo1.aula011;

public class a011_1 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        // criamos uma instancia
        int soma = calc.somar(10,20);
        int sub = calc.subtrair (15,5);
        int mult = calc.multiplicar (8,6);
        int div = calc.dividir (15,3);
    }

}
