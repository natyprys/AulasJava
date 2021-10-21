package modulo1.Atividades.AtividadePratica26;

import java.util.Objects;

public class Aluno extends Pessoa {
    public String matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj) {
        Aluno outroAluno = (Aluno) obj;
        if (this.matricula.equals(outroAluno.matricula) && this.turma.equals(outroAluno.turma) && this.curso.equals(outroAluno.curso)) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "------------------------Aluno---------------------------" +
                "\n\tMatricula = " + this.matricula  +
                "\n\tTurma = " + this.turma  +
                "\n\tCurso='" + this.curso  +
                "\n\tNome = " + this.nome +
                "\n\tsobrenome = " + this.sobrenome  +
                "\n\tidade = " + this.idade + "\n";

    }
}
