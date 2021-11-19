package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View2 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            
            //Statement - query SQL
            Statement statement = conn.createStatement();
            //usar statement do java.sql
      
            statement.execute("SELECT * FROM estado");

            //para pegar retorno do banco- ResultSet
            //Result = retorno da consulta
            ResultSet result = statement.getResultSet();

            
            // Imprimir resultado
            while(result.next()){  
                //verificar se tem proximas linhas
                // get--("nome da coluna")
                int id = result.getInt("id");           
                String nome = result.getString("nome");
                String sigla = result.getString("sigla");
                System.out.printf("%d - %s - %s\n", id, nome, sigla);
            }

            conn.close();

        } catch (SQLException e) {
            //System.out.println("Nao foi possivel conectar");
            e.printStackTrace();
            //para mostrar no console o erro
        }
    }
}
