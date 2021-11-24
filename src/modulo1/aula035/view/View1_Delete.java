package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionFactory;

public class View1_Delete{
    public static void main(String[] args) {
        // try with resources (para n ficar colocando close)

        // para clases que herdam de autoClose posso usar ela dentro do try/catch para q ela feche sozinha

        //public interface Connection  extends Wrapper, AutoCloseable 
        // PreparedStatement tbm herda do auto Close

        try(Connection conn = new ConnectionFactory().getConnection()) 
        {            
            int idDeletado = 16;            
            String sql = "DELETE FROM categoria WHERE id_categoria = ?";

            try ( PreparedStatement prepStatement = conn.prepareStatement(sql)) {
                prepStatement.setInt(1, idDeletado);
                prepStatement.execute();   
                int linhasAfetadas = prepStatement.getUpdateCount();
                System.out.println(linhasAfetadas);   
                 
            } catch (Exception e) {
                e.printStackTrace();
            }            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}