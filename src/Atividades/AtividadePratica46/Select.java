
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


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
            
            Statement statement = conn.createStatement();
      
            statement.execute("SELECT * FROM pais");
            ResultSet result = statement.getResultSet();

            
            // Imprimir resultado
            while(result.next()){  
                int id = result.getInt("id");           
                String nome = result.getString("nome");
                String sigla = result.getString("sigla");
                System.out.printf("%d - %s - %s\n", id, nome, sigla);
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}