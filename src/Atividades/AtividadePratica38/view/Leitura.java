package AtividadePratica38.view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("dados/livros.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            while(br.ready()){
                String linha = br.readLine();
                System.out.println(linha);
            }

            br.close();
            System.out.println("Arquivo aberto com sucesso!");

        }catch (FileNotFoundException e ){
            System.out.println("Arquivo não encontrado");
        }catch(IOException e){
            System.out.println("Não foi possivel ler o arquivo");
        }

    }
    
}
