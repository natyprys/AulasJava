package modulo1.aula018.P3.visual;

import modulo1.aula018.P3.modelo.Pessoa;
import modulo1.aula018.P3.repositorio.PessoaRepository;

import java.util.Scanner;

public class TelaPrincipal {
    public static void main(String[] args) {
        PessoaRepository pr =  new PessoaRepository();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o id da pessoa:");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Digite o nome da pessoa:");
            String nome = sc.nextLine();

            System.out.print("Digite o sobrenome da pessoa:");
            String sobrenome = sc.nextLine();

            Pessoa p1 = new Pessoa(id);
            p1.setNome(nome);
            p1.setSobrenome(sobrenome);
            pr.create(p1);
        }

        for (Pessoa p : pr.read() ) {
            System.out.println(p);
        }

    }
}
