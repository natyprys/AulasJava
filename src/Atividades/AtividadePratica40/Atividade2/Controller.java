package Atividade2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller implements IController {
    // Ctrl + . no controller

    public String salvar(String dado) {

        try {
            FileWriter fw = new FileWriter("Atividade2/PontosTuristicos.txt", true);
            fw.write(dado + "\n");
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }        
        return "Ponto Turistico: "+ dado + " salvo com sucesso!";
    }

    public ArrayList<String> ler() {  
        ArrayList<String> dados = new ArrayList<String>();
        try {
            Scanner sc = new Scanner(new File("Atividade2/PontosTuristicos.txt"));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                dados.add(linha);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }      
        return dados;
    }    

}
