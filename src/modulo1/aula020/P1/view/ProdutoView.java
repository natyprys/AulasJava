package modulo1.aula020.P1.view;

import modulo1.aula020.P1.controller.ProdutoController;
import modulo1.aula020.P1.model.Produto;

import java.util.ArrayList;

public class ProdutoView {
    public void executa() {
        Produto p = new Produto("Tv", 1999.99);

        p.setMarca("Samsung");

        ProdutoController controller = new ProdutoController();
        controller.salvar(p);

        ArrayList<Produto> prods = controller.listar();

        for (Produto prodSalvo : prods ){
            System.out.println(prodSalvo);

            //System.out.println(prodSalvo.valor);

        //  System.out.println(prodSalvo); caso coloque o Override;
        }
    }

}
