package AtividadePratica28.Views;

import AtividadePratica28.Controller.PessoaController;
import AtividadePratica28.Controller.PessoaFisicaController;
import AtividadePratica28.Models.Pessoa;
import AtividadePratica28.Models.PessoaFísica;

public class main {
    public static void main(String[] args) {
        PessoaController pessoaController = new PessoaController();
        PessoaFisicaController pessoaFisicaController = new PessoaFisicaController();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Augusto";
        pessoa1.endereco.cep = "92423423";
        pessoa1.endereco.endereco = "Quadra 4 Setor Sul casa9";
        pessoa1.endereco.cidade = "Gama";
        pessoa1.endereco.estado = "DF";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Jeff";
        pessoa2.endereco.cep = "343249932";
        pessoa2.endereco.endereco = "Quadra 1 Setor Leste casa 59";
        pessoa2.endereco.cidade = "Santa Maria";
        pessoa2.endereco.estado = "DF";

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Mateus";
        pessoa3.endereco.cep = "975597922";
        pessoa3.endereco.endereco = "Quadra 301 Norte casa 5";
        pessoa3.endereco.cidade = "Tagua";
        pessoa3.endereco.estado = "DF";

        //criar
        pessoaController.create(pessoa1);
        pessoaController.create(pessoa2);
        pessoaController.create(pessoa3);

        //imprimir
        System.out.println("==================== Pessoas ====================");
        System.out.println(pessoaController.read());

        //deletar
        pessoaController.delete(pessoa1);

        //update
        pessoaController.update(pessoa3);


        //imprimir
        System.out.println("==================== Pessoas ====================");
        System.out.println(pessoaController.read());


    }

}
