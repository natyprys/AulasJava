package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ViewUpdate {
    public static void main(String[] args) {
        try {
            String nome = "UpdatePrepStatement";
            int id = 25;
            Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.0.18:5432/postgres", "postgres", "123456");
            
            String sql = "UPDATE categoria SET nome=? WHERE id = ?";            
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, nome);   // 1 interrogação
            prepStatement.setInt(2, id);       //  2 interrogação

            prepStatement.execute();  
                      
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
