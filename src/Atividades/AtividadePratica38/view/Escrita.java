package Atividades.AtividadePratica38.view;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Escrita {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("dados/escritores.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Harper Lee \n");
            bw.write("Aldous Huxley \n");
            bw.write("Ray Bradbury \n");
            bw.close();

        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }catch(IOException e){
            System.out.println("Não foi possivel escrever o arquivo");
        }
    }

}
