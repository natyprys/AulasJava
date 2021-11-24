package view;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.ConnectionFactory;

public class View3_Insert {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            String nome = "kadlkaf";
            String descricao = "khkdsks";
            
            String sql = "INSERT INTO categoria (nome,descricao) values(? , ?)";
            PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            prepStatement.setString(2, descricao);

            prepStatement.execute();            
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id_categoria");
                System.out.println(id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
