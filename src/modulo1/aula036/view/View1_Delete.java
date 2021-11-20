package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import dao.ConnectionFactory;

public class View1_Delete{
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()){        
            CategoriaDao dao = new CategoriaDao(conn);      
            dao.delete(13);
                            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}