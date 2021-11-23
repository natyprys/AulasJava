package dao;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;


public class ConnectionFactory {
    private DataSource dataSource;

    public ConnectionFactory(){
        ComboPooledDataSource pool = new ComboPooledDataSource();

        pool.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        pool.setUser("postgres");
        pool.setPassword("123456");
        this.dataSource = pool;

        pool.setMaxPoolSize(50);
    }

    public Connection getConnection() throws SQLException{
        return this.dataSource.getConnection();
    }

}
