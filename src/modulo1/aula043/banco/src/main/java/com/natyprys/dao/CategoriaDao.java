package com.natyprys.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.natyprys.model.Categoria;

public class CategoriaDao {
    private EntityManager entityManager;

    public CategoriaDao(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        this.entityManager  = factory.createEntityManager();
    }

    public int create(Categoria model){
        //com persist
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);
        this.entityManager.getTransaction().commit();
        return model.getId();
    };
    

public List<Categoria> read(){
    return this.entityManager
    .createQuery("SELECT c FROM Categoria c", Categoria.class)
    .getResultList();
}


public void update(Categoria model){
    //com o merge
    this.entityManager.getTransaction().begin();
    this.entityManager.merge(model);        
    this.entityManager.getTransaction().commit();
}


public void delete(int id){
    Categoria model = this.entityManager.find(Categoria.class, id);
    if(model != null){
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(model);        
        this.entityManager.getTransaction().commit();
    }        
}

}
