package view;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.CategoriaDao;
import dao.ConnectionFactory;
import model.Categoria;

public class Select{
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {            
            CategoriaDao dao = new CategoriaDao(conn);

            for (Categoria c : dao.list()) {
                System.out.println(c);
             }
             ArrayList<Categoria> lista = dao.list();
             for (int i=0; i< lista.size(); i++) {
                 System.out.println(lista.get(i));
             }  
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}