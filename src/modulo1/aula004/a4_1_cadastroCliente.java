package modulo1.aula004;

// Crie um programa em linguagem Java que atenda aos seguintes requisitos:
//_ O programa deve realizar o cadastro de um cliente.
//_ De ser solicitado o nome, sobrenome e idade.
//_ Utilize o tipo mais adequado para armazenamento da idade do cliente.
//_ O programa deve permitir apenas clientes maiores de idade.
//_ Caso a idade preenchida seja menor de 18, o sistema deve exibir uma mensagem informando que o cliente não pode ser cadastrado.
//_ Caso o cliente possa ser cadastrado deve ser exibido os dados inserido para o cliente.
//_ Deve estar em um repositório do github e com usuário maykondgranemann como colaborador.


import java.util.Scanner;

public class a4_1_cadastroCliente {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome1 = sc.next();
        System.out.println("Digite o seu sobrenome: ");
        String nome2 = sc.next();


        System.out.println("Digite sua idade:  ");
        int idade = sc.nextInt();
            if (idade<18){
               System.out.println("O programa não permite clientes com idade inferior a 18 anos");
            } else {
                System.out.println("O nome do(a) cliente é:   " + nome1);
                System.out.println("O sobrenome do(a) cliente é:   " + nome2);
                System.out.println("A idade do(a) cliente é:   " + idade);
            }



    }
}