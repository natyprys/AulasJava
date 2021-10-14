package modulo1.aula020.model;

public class Produto extends BaseModel{
    private String nome;
    private double valor;
    private String marca;

    // para privado posso usar o construtor

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    // Mudar no produtoView os dados


  @Override
    public String toString(){
      return this.nome + " , " + this.valor + " , " + this.marca;
    }

    // Com o get e set tenho flexibilidade na forma qu eu mostro os dados.

}
