package view;

import dao.CategoriaDao;
import dao.ConnectionFactory;
import model.Categoria;

import java.sql.Connection;
import java.sql.SQLException;

public class View3_Insert {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            CategoriaDao dao = new CategoriaDao(conn);
            Categoria cat1 = new Categoria("Test1Dao");
 

            dao.create(cat1);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

