package modulo1.aula3;
//Crie um programa em linguagem Java que atenda aos seguintes requisitos:
// _ O programa deve realizar o cadastro de produtos e categorias
// _ O programa deve ter um cabeçalho com o nome do programa.
// _ O programa deve exibir uma mensagem de boas-vindas após a impressão do cabeçalho.
// _ O programa deve solicitar ao usuário o nome, descrição, valor e categoria de um produto.
// _ Ao final da execução o programa deve exibir a mensagem de sucesso juntamente com os dados do produto, utilizando a função printf().



import java.util.Scanner;

public class a3_1_ListaProdutos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ============================ Cadastro de Produtos =========================");
        System.out.println("Seja Bem-Vindo (a)!   \nDigite as informações do produto.");
        System.out.println("Qual o nome do produto?");
        String produto = sc.nextLine();

        System.out.println("Qual a descrição do produto?");
        String descricao = sc.nextLine();
        // nextLine lê os espaços

        System.out.println("Qual o valor do produto?");
        Double valor = sc.nextDouble();
        sc.nextLine();
        System.out.println("Qual a categoria do produto?");
        String categoria = sc.nextLine();

        System.out.printf("\t O produto %s, da categoria %s, com preço de R$ %f, com a seguinte descrição %s. Foi adicionado com sucesso! \n", produto,categoria,valor,descricao);

        // %f para números com casa decimal
        // %s para strings
        // %d para números inteiros

    }
}