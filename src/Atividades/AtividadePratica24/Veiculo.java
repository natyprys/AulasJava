package AtividadePratica24;

public class Veiculo {
    public String marca;
    public String modelo;
    public String placa;

    @Override
    public String toString() {
        return  "\n\tMarca: " + this.marca +
                "\n\tModelo: " + this.modelo +
                "\n\tNúmero da Placa: " + this.placa;
    }

}
