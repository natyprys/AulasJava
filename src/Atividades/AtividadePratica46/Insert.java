
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();
            String sql = "INSERT INTO pais (nome,sigla) values ('Chile' , 'CH')";
            // Aspas simples no values

            statement.execute(sql, statement.RETURN_GENERATED_KEYS);            
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
