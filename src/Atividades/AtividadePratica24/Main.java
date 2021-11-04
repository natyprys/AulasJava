package modulo1.Atividades.AtividadePratica24;

public class Main {
    public static void main(String[] args) {
    Veiculo veiculo1 = new Veiculo();
    veiculo1.placa = "0892373";
    veiculo1.modelo = "Fox";
    veiculo1.marca= "VW";

    Carro carro1 = new Carro();
    carro1.placa = "9797701";
    carro1.modelo = "XC60";
    carro1.marca = "Volvo";
    carro1.capacidadePortaMalas = 4;
    carro1.numPortas = 200;


    Object obj1 = veiculo1;
    Object obj2 = carro1;

    //Converta o primeiro objeto da Object novamente para um novo objeto da classe Veículo.
    // Converta o segundo objeto da Object novamente para um novo objeto da classe Carro.

    Veiculo veiculo2 = (Veiculo)obj1;
    Carro carro2 = (Carro)obj2;

    imprimir(veiculo2);

    imprimir(carro2);

    }

    public static void imprimir(Object obj){
        System.out.println(obj.toString());
    }

}


