package view;

import dao.CategoriaDao;
import model.Categoria;
import java.util.Scanner;

public class ViewCreate {
    public static void main(String[] args) {
        CategoriaDao dao = new CategoriaDao();
    
        Categoria model = new Categoria(); 
    
            try (Scanner sc = new Scanner(System.in)) {
    
                System.out.print("\nDigite a cat1:");
                model.setNome(sc.nextLine());    
               
            } catch (Exception e) {
                System.out.println("Erro ao ler");
            }
    
            dao.insert(model);      
        }
        
}

