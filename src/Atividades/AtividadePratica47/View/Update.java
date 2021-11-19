
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {
        
    
    try {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
        Statement statement = conn.createStatement();
        String sql = "UPDATE categoria SET nome = 'Sala de visita' where id_categoria= 1";    
        String sql2 = "UPDATE categoria SET nome = 'Sala de visita' where id_categoria= 2";

        statement.execute(sql);  
        statement.execute(sql2);  
         

        int linhasAfetadas = statement.getUpdateCount();
        System.out.println(linhasAfetadas);

        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
