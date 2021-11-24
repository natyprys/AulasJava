package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import dao.ConnectionFactory;
import model.Categoria;


public class Insert {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()){
            CategoriaDao dao = new CategoriaDao(conn);
            Categoria cat1 = new Categoria("Test4Dao");

            dao.create(cat1);

            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
