package AtividadePratica49.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Delete {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()){
        int id = 2;
        String sql = "DELETE FROM categoria WHERE id_categoria = 1" ; 
        
            try (PreparedStatement prepStatement = conn.prepareStatement(sql)){
                prepStatement.setInt(1, id);   
                prepStatement.execute( );   
                
                int linhasAfetadas = prepStatement.getUpdateCount();
                System.out.println(linhasAfetadas);         
            }catch(Exception e) {
                e.printStackTrace();
            }        

          
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
