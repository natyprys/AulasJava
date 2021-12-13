package com.natyprys.banco.repository;

import com.natyprys.banco.model.Filme;

import org.springframework.data.repository.CrudRepository;

//interface define os metodos mais n implementa
public interface FilmeRepository extends CrudRepository<Filme,Integer> {
    
}