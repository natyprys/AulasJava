package MVC_pratos.Controller;

import java.util.ArrayList;

public class BaseController <T> {
    private ArrayList<T> dados;

    public BaseController(){
        this.dados = new ArrayList<T>();
    }

    public  int numeroItens(){
        return dados.size();
    }

    // CRUD:

    public void create(T obj){
        this.dados.add(obj);
    }

    public ArrayList<T> read(){
        return this.dados;
    }

    public void update(T obj){
        if(existe(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }
    public void delete(T obj){
        this.dados.remove(obj);
    }

    public boolean existe(T obj){
        return this.dados.contains(obj);
    }

}
