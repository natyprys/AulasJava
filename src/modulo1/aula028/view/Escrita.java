package view;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Escrita {
    public static void main(String[] args) {
        //para escrita

        // FileOutputStream para um fluxo de saido do arquivo
        // OutputStreamWriter para escrita no Stream
        // BufferedWriter 

        try {
            FileOutputStream fos = new FileOutputStream("dados/molhos.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Sugo");
            bw.newLine();
            bw.write("Branco");
            bw.newLine();
            // ele só será salvo quando o bw for salvo
            // outra forma de escrita:
            // o arquivo sobrescreve sempre que eu rodar

            bw.write("Madeira \n");
            bw.write("Béchame \n");
            bw.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block ( ctl + .)
            System.out.println("Não foi possivel encontrar o arquivo");
        }catch (IOException e){
            System.out.println("Não foi possivel escrever no arquivo");
        }

    }
}
