package AtividadePratica49.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Select{
    public static void main(String[] args) {
        try {
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;

            String database = "postgres";
            String user = "postgres";
            String pwd = "123456";
            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);

            Connection conn =  DriverManager.getConnection(connectionString, user, pwd);
            
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");
      
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();

            
            // Imprimir resultado
            while(result.next()){  
                int id = result.getInt("id_categoria");           
                String nome = result.getString("nome");
                System.out.printf("%d - %s \n", id, nome);
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}