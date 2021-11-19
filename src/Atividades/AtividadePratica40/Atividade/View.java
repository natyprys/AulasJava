package Atividade;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class View {
    public static void main(String[] args) {
        salvar();
        ler();
    }

    private static void salvar(){
        Empresas empresa1 = new Empresas();
        empresa1.nome = "Viação Estrela";
        empresa1.cnpj = "79098020825";
        empresa1.ramoAtividade = "Empresa de ônibus";

        try {
            FileWriter fw = new FileWriter("Atividade/Empresas.csv", true);
            // ( arquivo, true) para dizer q ele vai incrementar ou inves de substituir
            String empresaString = empresa1.nome + ";" +empresa1.cnpj+ ";"+ empresa1.ramoAtividade + "\n";

            fw.write(empresaString);
            fw.close();
            
        } catch (IOException e) {
            System.out.println("Não foi possivel abrir o arquivo");
        }
    }

    private static void ler(){
        try {
            Scanner sc = new Scanner(new File ("Atividade/Empresas.csv"));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                String[] empresaString = linha.split(";");
                Empresas empresas = new Empresas();
                empresas.nome = empresaString[1];
                empresas.cnpj = empresaString[2];
                empresas.ramoAtividade = empresaString[3];
    

                System.out.printf("%s - %s - %s \n", empresas.nome ,empresas.cnpj, empresas.ramoAtividade);
            }

        }catch (FileNotFoundException e) {
            System.out.println("Não foi possivel abrir o arquivo");
        }

    }
}




    

