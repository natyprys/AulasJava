package modulo1.revisao_Classes;

import modulo1.aula011.Calculadora;

public class Principal {
    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas();
        pessoas.nome = "Nathalia";
        pessoas.sobrenome = "Priscila";
        pessoas.idade = 25;

        System.out.println(pessoas.nome);
        System.out.println(pessoas.sobrenome);
        System.out.println(pessoas.idade);

        Pessoas pessoas2 = new Pessoas();
        pessoas2.nome = "Agata";
        pessoas2.sobrenome = "Alves";
        pessoas2.idade = 32;

        System.out.println("---------------------------------------");
        System.out.println(pessoas2.nome);
        System.out.println(pessoas2.sobrenome);
        System.out.println(pessoas2.idade);


    }
}
