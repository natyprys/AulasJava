package AtividadePratica49.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Update {
    public static void main(String[] args) {
        
    
    try {
        String nome = "copaa";
        int id = 7;

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
        
        String sql = "UPDATE categoria SET nome=? WHERE id_categoria = ?";         
        PreparedStatement prepStatement = conn.prepareStatement(sql);
        prepStatement.setString(1, nome);
        prepStatement.setInt(2, id);

        prepStatement.execute();  
 
        int linhasAfetadas = prepStatement.getUpdateCount();
        System.out.println(linhasAfetadas);

        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
