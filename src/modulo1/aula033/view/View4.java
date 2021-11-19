package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class View4 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();
            String sql = "UPDATE estado SET nome = 'cjkhkak' where id= 10;";    
            //mudar o nome        

            statement.execute(sql);  
             
            //para ver as linhas afetadas
            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
