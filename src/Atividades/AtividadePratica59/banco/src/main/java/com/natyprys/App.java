package com.natyprys;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.natyprys.model.Categoria;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( " Atividade 59 " );
        Categoria model = new Categoria();
        model.setNome("Hibernate");
        model.setDescricao(" Atividade 59- JPA");

      
        //fabrica de conexão
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        // dentro do  Persistence.createEntityManagerFactory(" ") - colocar persistence-unit name
        
        //para pegar a conexão
        EntityManager em = factory.createEntityManager();

        //insert
        //abrir uma conexão e controlar a conexão pq n to usando o tomcat
        em.getTransaction().begin();
        em.persist(model);
        em.getTransaction().commit();


        //listar

        //criando uma query de consulta
        // CAtegoria em maiusculo pq é a Classe
        
        List<Categoria> lista = em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();
        //gera uma lista dessa classe

        for( Categoria categoria : lista){
            System.out.printf("%d - %s -%s \n", categoria.getId(), categoria.getNome(), categoria.getDescricao());
        }
    }
}
