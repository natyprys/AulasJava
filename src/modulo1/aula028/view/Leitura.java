package view;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura{
public static void main(String[] args) {
    //criando fluxo de entrada atraves de um arquivo
    //FileInputStream fis = new FileInputStream("pratos.txt");
    // temos que tratar um possivel erro por isso colocamos dentro de um try catch

    try{
        FileInputStream fis = new FileInputStream("dados/pratos.txt");
        //Para ler o arquivo- Precisamos fazer outro tratamento IOException.
        //System.out.println(fis.read());
        
        //leitura do stream de Entrada
        // FileInputStream herda de InputStream
        
        InputStreamReader isr = new InputStreamReader(fis);
        
        //char[] dados = new char[5]; 
        //esse isr.read armazena o dado em um char, por isso a criação do dados[].
        //isr.read(dados, 0, 4);
        //System.out.println(dados);

        // podemos utilizar o buffered que acumula todos os caracteres e eu não preciso me limitar a saber o tamanho do meu array.
        // vou acumulando numa entrada para jogar o buffered em uma saida e ler tudo.
        
        BufferedReader br = new BufferedReader(isr);
        //String linha = br.readLine();
        //System.out.println(linha);
        //conseguiu ler uma linha, para ler mais linhas fazemos:
        // br.ready que é um boolean que mostra quando tem mais linhas no documento

        while(br.ready()){
            String linha = br.readLine();
            System.out.println(linha);
        }

        br.close();
        // tenho que fechar o br

        System.out.println("Arquivo aberto com sucesso!");

    }catch (FileNotFoundException e){
        System.out.println("Arquivo não encontrado");
    }catch(IOException e){
        System.out.println("Não foi possivel ler o arquivo");
    }
 
}
}
    
