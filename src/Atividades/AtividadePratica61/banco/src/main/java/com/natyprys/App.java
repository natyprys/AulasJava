package com.natyprys;

import com.natyprys.dao.CategoriaDao;
import com.natyprys.model.Categoria;

public class App {
public static void main( String[] args ){
    CategoriaDao dao = new CategoriaDao();
    
    Categoria model = new Categoria();
        model.setId(45);
        model.setNome("up");
        model.setDescricao("testando up");
        
        //dao.create(model);
        //dao.update(model); 
        dao.delete(41);

    for( Categoria categoria : dao.read()){
           System.out.printf("%d - %s -%s \n", categoria.getId(), categoria.getNome(), categoria.getDescricao());
        }
    }
}
