package modulo1.aula014;
// Crie uma classe para cálculo de impostos.
//_ A classe de calculo deve possuir 3 métodos, um para calculo de ISS, outro para cálculo de IOF e outro para cálculo de IR.
//_ A classe deve manter em variáveis privadas o valor de cada imposto que deve ser definido por você.
//_ Os métodos devem receber como parâmetro um valor que servirá de base para cálculo do imposto e retornar o valor do imposto calculado.

public class CalculadoraImposto {
    private double taxaISS = 0.03;
    private double taxaIOF = 0.05;
    private double taxaIR = 0.075;


    double calculoISS(double valor){
        return valor * taxaISS ;
    }

    double calculoIOF(double valor){
        return valor * taxaIOF  ;
    }

    double calculoIR (double valor){
        return valor * taxaIR ;
    }

}
