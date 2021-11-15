package view;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Leitura {
    public static void main(String[] args) {
       try{ 
            Scanner sc  = new Scanner(new File ("dados/Dd.txt"));
            
            while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
            }
        
        }catch (FileNotFoundException e) {
        System.out.println("Não foi possivel encontrar o arquivo");
        
}
}
}