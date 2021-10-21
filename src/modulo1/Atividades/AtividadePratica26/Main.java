package modulo1.Atividades.AtividadePratica26;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Paulo";
        pessoa1.sobrenome = "Augusto";
        pessoa1.idade = 34;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Antonio";
        aluno1.sobrenome = "Oliveira";
        aluno1.idade = 50;
        aluno1.matricula = "30801-33132";
        aluno1.turma = "AA";
        aluno1.curso = "Arquitetura";

        //Crie um objeto da classe Dados e chame o metodo para adicionar os objetos de Pessoa e Aluno ao array.
        Dados dados = new Dados();
        System.out.println(dados.add(pessoa1));
        System.out.println(dados.add(aluno1));

        //Crie um novo objeto para Pessoa e atribua os mesmos dados da pessoa criada anteriormente.
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Fabio";
        pessoa2.sobrenome = "Lins";
        pessoa2.idade = 7;

        System.out.println(aluno1);
        System.out.println(pessoa1);
        System.out.println(pessoa2);


        //Verifique se o segundo objeto de pessoa já está salvo no array
        //System.out.println(dados.contains(pessoa2));

        //Remova o aluno do array, utilizando o método da classe Dados.
        System.out.println(dados.remove(aluno1));

        System.out.println(dados.size());

    }
}
