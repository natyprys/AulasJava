package modulo1.AtividadePratica20;

public class Aluno extends Pessoa{
   private String curso;
   private String turma;


   public void setCurso(String curso) {
      this.curso = curso;
   }
   public String getCurso() {
      return curso;
   }

   public void setTurma(String turma) {
      this.turma = turma;
   }

   public String getTurma() {
      return turma;
   }
}
