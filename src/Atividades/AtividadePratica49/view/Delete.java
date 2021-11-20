package AtividadePratica49.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Delete {
    public static void main(String[] args) {
        try {
        int id = 2;

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
        
        String sql = "DELETE FROM categoria WHERE id_categoria = 1" ; 
        PreparedStatement prepStatement = conn.prepareStatement(sql);
           

        prepStatement.execute();   
        int linhasAfetadas = prepStatement.getUpdateCount();
        System.out.println(linhasAfetadas);         
        prepStatement.setInt(1, id);    

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
