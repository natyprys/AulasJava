package modulo1.Atividades.AtividadePratica25;

public class Notebook extends Computador {
    public String bateria;
    public String velocidadeWifi;
    public Double VersaoBluetooth;

    @Override
    public String toString() {
        return "\n-----------------------Notebook-----------------------" +
                "\n\tMarca = " + this.marca  +
                "\n\tMemoriaRAM = " + this.memoriaRAM  +
                "\n\tProcessador = " + this.processador +
                "\n\tDiscoRigido = " + this.discoRigido +
                "\n\tBateria = " + this.bateria +
                "\n\tVelocidadeWifi = " + this.velocidadeWifi +
                "\n\tVersaoBluetooth = " + this.VersaoBluetooth + "\n";
    }
}
