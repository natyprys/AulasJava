package view;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Escrita3 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
        
            fw = new FileWriter("dados/molhos.txt", true);
            // true- adicionar coisas.
            //o padrão e false- ai ele reescreve
            fw.write("Sugo\n");
            fw.write("Branco\n");
            fw.write("Madeira\n");
            fw.write("Bolonhesa\n");
            fw.close();          

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel encontrar o arquivo");
        }catch (IOException e){
            System.out.println("Não foi possivel escrever no arquivo");

        }//finally{
            //fw.close();    
        // não usamos finally aqui
    
}
}