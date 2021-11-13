package AtividadePratica30.Views;

import AtividadePratica30.Controller.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.cabecalho();
        calc.imprime_menu();
        calc.escolha_menu();

    }
}
