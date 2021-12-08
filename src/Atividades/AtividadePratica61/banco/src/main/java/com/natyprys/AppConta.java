package com.natyprys;

import com.natyprys.dao.ContaCorrenteDao;
import com.natyprys.model.ContaCorrente;

public class AppConta {
    public static void main( String[] args ){
        ContaCorrenteDao dao = new ContaCorrenteDao();
        ContaCorrente model = new ContaCorrente();
        model.setId(2);
        model.setNome("natyy");
        model.setDescricao("Conta zero tarifa 2");

        //dao.create(model);
        //dao.update(model);
        dao.delete(1);

        for( ContaCorrente contaCorrente : dao.read()){
            System.out.printf("%d - %s -%s \n", contaCorrente.getId(), contaCorrente.getNome(), contaCorrente.getDescricao());
         }
     }
 }


