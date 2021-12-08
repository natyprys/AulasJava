package com.natyprys;



import com.natyprys.dao.CategoriaDao;
import com.natyprys.model.Categoria;

public class App{
    public static void main( String[] args ){
        CategoriaDao dao = new CategoriaDao();

        Categoria model = new Categoria();
        model.setId(45);
        model.setNome("update");
        model.setDescricao("testanduuu update ");
       
        //dao.create(model);
        //dao.update(model);
        dao.delete(45);

        for( Categoria categoria : dao.read()){
            System.out.printf("%d - %s -%s \n", categoria.getId(), categoria.getNome(), categoria.getDescricao());
        }

    }
}
