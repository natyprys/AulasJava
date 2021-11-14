package view;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Escrita{
    public static void main(String[] args) {
        PrintStream ps = null;
        try{
        
            ps = new PrintStream("dados/molhos.txt");
            ps.println("Sugo");
            ps.println("Branco");
           
          
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel encontrar o arquivo");

        }finally{
            //obriga a passar por aqui e fechar o ps
            //ps precisa ser inicializada
            ps.close();    
        }
    }
}
