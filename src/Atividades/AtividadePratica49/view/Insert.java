package AtividadePratica49.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.core.v3.ConnectionFactoryImpl;

public class Insert {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()){

            String nome = "corredor";
            String descricao = "categorias casa";

            String sql ="INSERT INTO categoria (nome, descricao) values (?, ?)";
            PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            prepStatement.setString(2,descricao);

            prepStatement.execute();            
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt(1);
                System.out.println(id);
            }

            //conn.close(); - não precisa mais
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
