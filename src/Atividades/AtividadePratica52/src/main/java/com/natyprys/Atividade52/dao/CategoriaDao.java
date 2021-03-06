package com.natyprys.Atividade52.dao;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import  com.natyprys.Atividade52.model.Categoria;

public class CategoriaDao {
    

public int insert(Categoria model){               
     int idGerado = 0;   
 
     try (Connection conn = new ConnectionFactory().getConnection()) {
    	
    	String sql = "INSERT INTO categoria(nome, descricao) values(?, ?)";
        PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);          
            
        prepStatement.setString(1, model.getNome());
        prepStatement.setString(2, model.getDescricao());

        prepStatement.execute();            
        ResultSet ids = prepStatement.getGeneratedKeys();

        while(ids.next()){
            int id = ids.getInt("id_categoria");
                System.out.println(id);
            }
     } catch (SQLException e) {
 		e.printStackTrace();
 	}
 		return idGerado;
 }    
    

public ArrayList<Categoria> read(){
	
       ArrayList<Categoria> list = new  ArrayList<Categoria>();

       try (Connection conn = new ConnectionFactory().getConnection()) { 
        PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");
        prepStatement.execute();
        ResultSet result = prepStatement.getResultSet();
            
            while(result.next()){
            	Categoria model = new Categoria();
				model.setId(result.getInt("id_categoria"));
				model.setNome(result.getString("nome"));
				model.setDescricao(result.getString("descricao"));
				list.add(model);
            }
   	} catch (SQLException e) {
   		e.printStackTrace();
   	}
       
   	return list;
   	}
  
    public int update (Categoria model){       
    	int linhasAfetadas = 0;
    	
    	try (Connection conn = new ConnectionFactory().getConnection()) {
     
        String sql = "UPDATE categoria SET nome=? WHERE id_categoria = ?";            
        PreparedStatement prepStatement = conn.prepareStatement(sql);
        
        prepStatement.setString(1, model.getNome());
        prepStatement.setInt(2, model.getId());
        prepStatement.execute();  
                  
        linhasAfetadas = prepStatement.getUpdateCount();  
    }catch (SQLException e) {
		e.printStackTrace();
}
    	return linhasAfetadas;
}

    public int delete(Categoria model){         
        int linhasAfetadas = 0;
        
        try (Connection conn = new ConnectionFactory().getConnection()) {
        String sql = "DELETE FROM categoria WHERE id_categoria = ?";

        	try ( PreparedStatement prepStatement = conn.prepareStatement(sql)) {
        		prepStatement.setInt(1, model.getId());
        		prepStatement.execute();   
        		linhasAfetadas = prepStatement.getUpdateCount();
  
        	} catch (Exception e) {
        		e.printStackTrace();
        	}

    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return linhasAfetadas;
    }
}
