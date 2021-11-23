package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.ConnectionFactory;

public class Update {
    public static void main(String[] args) {
        
    
    try(Connection conn = new ConnectionFactory().getConnection()) {

        String nome = "copaa";
        int id = 7;
        
        String sql = "UPDATE categoria SET nome=? WHERE id_categoria = ?";         
        PreparedStatement prepStatement = conn.prepareStatement(sql);
        prepStatement.setString(1, nome);
        prepStatement.setInt(2, id);

        prepStatement.execute();  
 
        int linhasAfetadas = prepStatement.getUpdateCount();
        System.out.println(linhasAfetadas);

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
