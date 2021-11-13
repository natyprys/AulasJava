package AtividadePratica22;

public class Aluno{
    private String nomeCompleto;
    private String matricula;
    private int idade;

    public Aluno (String nomeCompleto, String matricula, int idade){
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.idade = idade;
    }

    public void setNomeCompleto (String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }


    public void setMatricula (String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        String objetoEmString = "\nO nome informado foi:  " + this.nomeCompleto + "\nA matricula informada foi:  " + this.matricula + "\nA idade informada foi:  " + this.idade + "\n";
        return objetoEmString;
    }
}
