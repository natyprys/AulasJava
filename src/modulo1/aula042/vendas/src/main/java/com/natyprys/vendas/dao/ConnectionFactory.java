package com.natyprys.vendas.dao;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    private DataSource dataSource;

    public ConnectionFactory(){
        ComboPooledDataSource pool = new ComboPooledDataSource();
        this.dataSource = pool;
    }

        //setando o drive para conexão com o banco de forma manual
        //  pool.setDriverClass("org.postgres.Driver");

        //try {
          //  pool.setDriverClass("org.postgresql.Driver");
        //} catch (PropertyVetoException e) {

          //  e.printStackTrace();
        //}

        //pool.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        //pool.setUser("postgres");
        //pool.setPassword("123456");
        
        // - essas informações foram colocadas no resources


    public Connection getConnection() throws SQLException{
        return this.dataSource.getConnection();
    }    
}
