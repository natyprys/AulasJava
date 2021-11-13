package AtividadePratica25;

public class Computador {
    public String marca;
    public String memoriaRAM;
    public String processador;
    public String discoRigido;

    @Override
    public String toString() {
        return "\n---------------------Computador------------------- " +
                "\n\tMarca = " + this.marca  +
                "\n\tMemoriaRAM = " + this.memoriaRAM  +
                "\n\tProcessador = " + this.processador +
                "\n\tDiscoRigido = " + this.discoRigido + "\n";
    }
}
