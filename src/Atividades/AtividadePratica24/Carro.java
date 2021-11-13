package AtividadePratica24;

public class Carro extends Veiculo {
    public int numPortas;
    public int capacidadePortaMalas;


    @Override
    public String toString() {
        return  "\n\tMarca: " + this.marca +
                "\n\tModelo: " + this.modelo +
                "\n\tNúmero da Placa: " + this.placa +
                "\n\tQuantidade de Portas: " + this.numPortas +
                "\n\tCapacidade do Porta-Malas: " + this.capacidadePortaMalas;
    }
}
