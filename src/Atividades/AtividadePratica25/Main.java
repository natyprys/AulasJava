package AtividadePratica25;

public class Main {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.marca = "Dell";
        computador1.memoriaRAM = "4 GB";
        computador1.processador = "i5";
        computador1.discoRigido = "500 GB";


        Desktop desktop1 = new Desktop();
        desktop1.marca = "Positivo";
        desktop1.memoriaRAM = "8 GB";
        desktop1.processador = "i7";
        desktop1.discoRigido = "1 TB";
        desktop1.fonte = "550W";
        desktop1.tamanhoGabinete = 23.8;
        desktop1.monitorExterno = 25.0;


        Notebook notebook1 = new Notebook();
        notebook1.marca = "Acer";
        notebook1.memoriaRAM = "8 GB";
        notebook1.processador = "i7";
        notebook1.discoRigido = "1 TB";
        notebook1.bateria = "4400 Milliampere";
        notebook1.VersaoBluetooth = 5.0 ;
        notebook1.velocidadeWifi = "250 Mega";


        Object obj1 = computador1;
        Object obj2 = desktop1;
        Object obj3 = notebook1;

        Computador computador2 =  (Computador) obj1;
        Desktop desktop2 = (Desktop) obj2;
        Notebook notebook2 = (Notebook) obj3;

        imprimir(computador2);
        imprimir(desktop2);
        imprimir(notebook2);
    }

    //Imprima todos os dados do objeto convertidos através do toString

    public static void imprimir(Object obj){
        System.out.println(obj.toString());
    }
}
