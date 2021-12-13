package com.natyprys.banco;


import java.util.List;

import com.natyprys.banco.model.Filme;
import com.natyprys.banco.repository.FilmeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class BancoApplication implements CommandLineRunner {
	//como estamos usando uma interface n podemos usar o new
	private FilmeRepository repository;

	//isso é pelo spring
	public BancoApplication(FilmeRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Filme model = new Filme();
		//model.setId(3);
		model.setNome("Esqueceram de mim");
		model.setNomeDiretor("Kevin");
		model.setGenero("Aventura");

		repository.save(model);

		// List<Filme> lista = (List<Filme>)repository.findAll();

		// System.out.println("\n");
		// for (Filme f : lista) {
		// 	System.out.printf("%d - %s\n", f.getId(), f.getNome());
		// }
		// System.out.println("\n");

		//repository.deleteById(1);
		
		//System.out.println("\n");
		//repository.findAll().forEach(f -> System.out.printf("%d - %s\n", f.getId(), f.getNome()));				
		//System.out.println("\n");
	}

}