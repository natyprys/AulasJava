package modulo1.Atividades.AtividadePratica23.controller;

import modulo1.Atividades.AtividadePratica23.model.Livro;

import java.util.ArrayList;

public class LivroController {
    private ArrayList<Livro> livros = new ArrayList<Livro>();


// métodos de CRUD
    //Os métodos precisam ser públicos para serem acessível de fora
    // create, read, update, delete

    public void salvar (Livro l){
        this.livros.add(l);
    }

    public  ArrayList<Livro> listar(){
        return livros;
    }

    public void  alterar (Livro l){
        Livro livroauxiliar = null;
        // procurar livro
        for (Livro livro1 : listar()){

            if (l.getId() == l.getId()){
                livroauxiliar = l;
            }
        }

        // se o livro foi achado, ele é substituido
        if (livroauxiliar != null){
            this.deletar(livroauxiliar);
            this.salvar(l);
        }
    }

    public void deletar (Livro l){
        this.livros.remove(l);
        //remover por objeto e não pela posição.
        //utiliza um equals, por isso preciso reescrever no livro oq seria esse equals, para estarem no mesmo campo de memória.
    }


}
