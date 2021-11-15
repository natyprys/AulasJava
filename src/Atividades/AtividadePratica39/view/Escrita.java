package view;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Escrita{
    public static void main(String[] args) {
        try{
            InputStream is = System.in;
            Reader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            OutputStream fos = new FileOutputStream("dados/Dd.txt");
            Writer osw = new  OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
                
            String linha = " ";

            while(linha != null && !linha.equals("q")) {
                linha = br.readLine();
                bw.write(linha + "\n");

            }

            bw.close();
            br.close();

            System.out.println("Salvo !!");

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel encontrar o arquivo");
        }catch (IOException e){
            System.out.println("Não foi possivel escrever no arquivo");

        }
    }
}