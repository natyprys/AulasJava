
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) {
        try {

            String nome = "corredor";
            String descricao = "categorias casa";

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO categoria (nome, descricao) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            prepStatement.setString(2,descricao);


            prepStatement.execute();            
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt(1);
                System.out.println(id);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
