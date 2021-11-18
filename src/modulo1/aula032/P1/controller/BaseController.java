package P1.controller;

import java.util.ArrayList;

import P1.dao.IDao;
import P1.model.BaseModel;

public abstract class BaseController<T extends BaseModel> {
    private ArrayList<T> list;
    private IDao<T> dao;

    //construtor
    public BaseController(IDao<T> dao) {
        this.list = new ArrayList<T>();
        this.dao = dao;
    }

    //CRUD
    public void create(T model){
        this.list.add(model);
        this.dao.save(model);
    }
    public ArrayList<Object> read(){   
        // return this.list;     
        return dao.list(); 
    }
    public void update(T model){
        if(this.list.contains(model)){
            this.delete(model);
            this.create(model);
        }

        dao.update(model);
    }
    public void delete(T model){
        this.list.remove(model);
        dao.remove(model);
    }
}