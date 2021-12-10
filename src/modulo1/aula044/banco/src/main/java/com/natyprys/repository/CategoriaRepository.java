package com.natyprys.repository;

import java.util.List;


import com.natyprys.model.Categoria;

public class CategoriaRepository extends BaseRepository<Categoria>{
    public List<Categoria> read(){
        return this.getEntityManager()
            .createQuery("SELECT c FROM Categoria c", Categoria.class)
            .getResultList();
    }
    public void delete(int id){
        Object model = this.getEntityManager().find(Categoria.class, id);
        if(model != null){
            this.getEntityManager().getTransaction().begin();
            this.getEntityManager().remove(model);        
            this.getEntityManager().getTransaction().commit();
        }        
    }

}
