package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View1 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();
            String sql = "INSERT INTO estado (nome,sigla, pais_id) values ('Rio de Janeiro' , 'RJ', 1)";
            // Aspas simples no values

            statement.execute(sql, Statement.RETURN_GENERATED_KEYS);            
            //para armazenar as keys q foram geradas
            ResultSet ids = statement.getGeneratedKeys();

            while(ids.next()){
                // comeca em 1(nao em 0)
                int id = ids.getInt(1);
                System.out.println(id);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}