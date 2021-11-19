package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class View{
    public static void main(String[] args) {
        //conectar com o banco
        // gerenciador de drives que vai gerar a conexão (url, user, password)



        try {
            //Connection conn = DriverManager.getConnection ("jdbc:postgresql://localhost:5432/postgres","postgres","123456");
            //String connectionString = "jdbc:postgresql://localhost:5432/postgres";
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;

            String database = "postgres";
            String user = "postgres";
            String pwd = "123456";
            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);

            Connection conn =  DriverManager.getConnection(connectionString, user, pwd);

            conn.close();
            //fechando conexão

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar");
        }
    }

}