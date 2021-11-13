package AtividadePratica31.controller;

import java.util.ArrayList;

public class baseController<T> {
    private ArrayList<T> dados;

    public baseController(){
        this.dados = new ArrayList<T>();
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

    public ArrayList<T> listar(){
        return this.dados;
    }

}

