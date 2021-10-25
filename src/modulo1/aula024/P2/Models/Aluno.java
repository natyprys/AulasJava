package modulo1.aula024.P2.Models;

public class Aluno extends Pessoa  {
    public String matricula;
    public String turma;
    public String curso;


    @Override
    public String toString() {
        String retorno =  super.toString() +";"+ this.matricula +";"+ this.turma +";"+ this.curso;
        return retorno;
    }
}
