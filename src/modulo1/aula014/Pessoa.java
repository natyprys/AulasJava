package modulo1.aula014;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private  int idade;
    private String cpf;

    public void setNome(String nome) {
        if (nome.length() > 2) {
            this.nome = nome;
        }
    }
    public String getNome(){
            return this.nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }


}

// set - manipula atributos privados e salvo na classe
// get - retorna