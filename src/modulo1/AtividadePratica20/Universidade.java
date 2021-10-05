package modulo1.AtividadePratica20;

public class Universidade {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();

        f.setNome("Mateus");
        f.setSobrenome("Antunes");
        f.setMatricula("789907222");
        f.setSalario(3000.00);
        f.setDepartamento("Física");

        System.out.println("\n--------------Funcionário -------------------------\n");
        System.out.println("\tNome: " + f.getNome() +"\n\tSobrenome: " + f.getSobrenome() + "\n\tMatricula: " + f.getMatricula() + "\n\tSalario: " + f.getSalario() +"\n\tDepartamento: " + f.getDepartamento());


        Coordenador c = new Coordenador();
        c.setNome("Tiago");
        c.setSobrenome("Visco");
        c.setMatricula("00021342");
        c.setSalario(9000.00);
        c.setCursoCoordenado("Engenharias");
        c.setBonus(1000.00);

        System.out.println("\n--------------Coordenador -------------------------\n");
        System.out.println("\tNome: " + c.getNome() +"\n\tSobrenome: " + c.getSobrenome() + "\n\tMatricula: " + c.getMatricula() + "\n\tSalario: " + c.getSalario() +"\n\tCoordenador do departamento: " + c.getCursoCoordenado() +"\n\tBonus: " + c.getBonus());


        Aluno a = new Aluno();
        a.setNome("Nathália");
        a.setSobrenome("Priscila");
        a.setMatricula("2017030801");
        a.setCurso("Física");
        a.setTurma("2017");

        System.out.println("\n-------------- Aluno -------------------------\n");
        System.out.println("\tNome: " + a.getNome() +"\n\tSobrenome: " + a.getSobrenome() + "\n\tMatricula: " + a.getMatricula() + "\n\tCurso: " + a.getCurso() +"\n\tTurma: " + a.getTurma());


    }
}
