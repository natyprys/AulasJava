package modulo1.aula029.view;

import java.io.*;


public class Escrita{
public static void main(String[] args) {
    try{
        InputStream fis = new FileInputStream("dados/molhos.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("dados/molhos2.txt");
        Writer osw = new  OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        while(br.ready()){
            String linha = br.readLine();
            bw.write(linha);
            bw.newLine();
        }

        bw.close();
        br.close();
        // tenho que fechar o br e o bw

        System.out.println("Arquivo aberto com sucesso!");

    } catch (FileNotFoundException e) {
        System.out.println("Não foi possivel encontrar o arquivo");
    }catch (IOException e){
        System.out.println("Não foi possivel escrever no arquivo");

}
}
}