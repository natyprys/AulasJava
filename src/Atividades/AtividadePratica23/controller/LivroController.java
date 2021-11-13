package AtividadePratica23.controller;

import AtividadePratica23.model.Livro;

import java.util.ArrayList;

public class LivroController {
    private ArrayList<Livro> livros = new ArrayList<Livro>();


// métodos de CRUD
    //Os métodos precisam ser públicos para serem acessível de fora
    // create, read, update, delete

    public void salvar (Livro livro){
        this.livros.add(livro);
    }

    public  ArrayList<Livro> listar(){
        return this.livros;
    }

    public void  alterar (Livro livro){
        Livro livroauxiliar = null;
        // procurar livro
        for (Livro livro1 : listar()){

            if (livro.getId() == livro.getId()){
                livroauxiliar = livro;
            }
        }

        // se o livro foi achado, ele é substituido
        if (livroauxiliar != null){
            this.deletar(livroauxiliar);
            this.salvar(livro);
        }
    }

    public void deletar (Livro livro){
        this.livros.remove(livro);
        //remover por objeto e não pela posição.
        //utiliza um equals, por isso preciso reescrever no livro oq seria esse equals, para estarem no mesmo campo de memória.
    }


}
