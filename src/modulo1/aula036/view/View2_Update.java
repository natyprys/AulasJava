package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import dao.ConnectionFactory;
import model.Categoria;

public class View2_Update {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            CategoriaDao dao = new CategoriaDao(conn);     
            Categoria model = new Categoria(18, " casaa ", " adfaa ");
            System.out.println(dao.update(model));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
