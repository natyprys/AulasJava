package modulo1.Atividades.AtividadePratica25;

public class Desktop extends Computador{
    public Double tamanhoGabinete;
    public Double monitorExterno;
    public String fonte;

    @Override
    public String toString() {
        return "\n-----------------------Desktop-----------------------" +
                "\n\tMarca = " + this.marca  +
                "\n\tMemoriaRAM = " + this.memoriaRAM  +
                "\n\tProcessador = " + this.processador +
                "\n\tDiscoRigido = " + this.discoRigido +
                "\n\tTamanhoGabinete = " + this.tamanhoGabinete +
                "\n\tMonitorExterno = " + this.monitorExterno +
                "\n\tFonte = " + this.fonte + "\n" ;
    }
}
