package utils;

// Downloads
//   https://repo1.maven.org/maven2/com/mchange/c3p0/0.9.5.4/c3p0-0.9.5.4.jar
//   https://repo1.maven.org/maven2/com/mchange/mchange-commons-java/0.2.15/mchange-commons-java-0.2.15.jar

// Padrão de projeto no sentido de fabrica- onde solicito a instancia/criação de algo

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    private DataSource dataSource;
    // fonte de dados (mais abstrata que pool e driverManager)


    public ConnectionFactory() {
        //criando poll de conexões
        ComboPooledDataSource pool = new ComboPooledDataSource();
        // vem da biblioteca inserida com.mchange.v2.c3p0.ComboPooledDataSource
        pool.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        pool.setUser("postgres");
        pool.setPassword("123456");
        this.dataSource = pool;

        
        pool.setMaxPoolSize(10);
        //quantidade máxima de conexões (consultas ao mesmo tempo)
    }

    public Connection getConnection() throws SQLException{
        //retirado - return DriverManager.getConnection(this.url, this.user, this.password);        
        return this.dataSource.getConnection();
    }
    //não faz sentido colocar o try/catch aqui, pois ele vai ser usado na view.
    // ai usamos add throws, ai quem utilizar esse metodo vai ter que fazer o try/catch

}
