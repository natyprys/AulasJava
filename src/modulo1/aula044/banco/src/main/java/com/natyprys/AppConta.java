package com.natyprys;

import com.natyprys.model.ContaCorrente;
import com.natyprys.repository.ContaCorrenteRepository;

public class AppConta {
    public static void main( String[] args ){
        ContaCorrenteRepository dao = new ContaCorrenteRepository();
        ContaCorrente model = new ContaCorrente();
        model.setNome("Conta do Joaozin");
        model.setDescricao("Conta zero tarifa");

        dao.create(model);
    }
}
