package view;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Escrita2 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try{
        
            pw = new PrintWriter("dados/molhos.txt");
            pw.println("Sugo");
            pw.println("Branco");
            pw.println("Madeira");
            pw.println("Bolonhesa");
            // funciona do mesmo jeito que a PrintStream
          
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel encontrar o arquivo");

        }finally{
            //obriga a passar por aqui e fechar o ps
            //ps precisa ser inicializada
            pw.close();    
        }
    }
}
