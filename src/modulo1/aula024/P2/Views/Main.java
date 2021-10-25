package modulo1.aula024.P2.Views;

import modulo1.aula024.P2.Controllers.AlunoController;
import modulo1.aula024.P2.Controllers.PessoaController;
import modulo1.aula024.P2.Models.Aluno;
import modulo1.aula024.P2.Models.Pessoa;

public class Main {
    public static void main(String[] args) {
        PessoaController pessoaController = new PessoaController();
        AlunoController alunoController = new AlunoController();

        Pessoa p1 = new Pessoa();
        p1.nome = "Inês";
        p1.sobrenome = "Brasil";
        p1.idade = 32;

        Aluno a1 = new Aluno();
        a1.nome = "Jojo";
        a1.sobrenome = "Calypso";
        a1.idade = 38;
        a1.matricula = "asdasd";
        a1.turma = "Do fundao";
        a1.curso = "VASP";

        pessoaController.create(p1);
        alunoController.create(a1);

        Pessoa p2 = new Pessoa();
        p2.nome = "Inês";
        p2.sobrenome = "Brasil";
        p2.idade = 32;

        boolean e = pessoaController.existe(p2);
        System.out.println(e);

        alunoController.delete(a1);
        System.out.println(alunoController.existe(a1));
    }
}