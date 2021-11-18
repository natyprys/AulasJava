package P1.model;

public class Pessoa extends BaseModel{
    public String nome;
    public String sobrenome;

    public Pessoa() {
        super();
    }
    //sobrecarga de metodos

    public Pessoa(String pessoaString) {
        String[] dados = pessoaString.split(";");
        // quebra de String para que cada ";" seja um dado novo para cada posição da lista
        // vetor de Strings
        this.id= Integer.parseInt(dados[0]);
        this.nome = dados[1];
        this.sobrenome = dados[2];
    }

    @Override
    public String toString() {
        //String.format igual ao printf
        String retorno = String.format("%s;%s;%s", super.toString(), this.nome, this.sobrenome);        
        return retorno;
        //o id ta com o %s pq já vem da Base Model convertido para String
    }
}
