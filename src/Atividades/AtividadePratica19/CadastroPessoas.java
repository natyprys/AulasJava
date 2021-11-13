package AtividadePratica19;

public class CadastroPessoas {
    public static void main(String[] args) {

        PessoaFisica[] pessoa = new PessoaFisica[5];


        PessoaFisica pessoa1 = new PessoaFisica();
        pessoa1.setCodigo("200");
        pessoa1.setNome("Nathalia");
        pessoa1.setSobrenome("Assunção");
        pessoa1.setIdade(25);
        pessoa1.setRg("435245235");
        pessoa1.setCpf("003.332.398-12");


        PessoaFisica pessoa2 = new PessoaFisica();
        pessoa2.setCodigo("201");
        pessoa2.setNome("Priscila");
        pessoa2.setSobrenome("Lins");
        pessoa2.setIdade(13);
        pessoa2.setRg("43545246546");
        pessoa2.setCpf("123.343.342-09");


        PessoaFisica pessoa3 = new PessoaFisica();
        pessoa3.setCodigo("202");
        pessoa3.setNome("Jefferson");
        pessoa3.setSobrenome("Alves");
        pessoa3.setIdade(36);
        pessoa3.setRg("56456563");
        pessoa3.setCpf("632.753.551-31");


        PessoaFisica pessoa4 = new PessoaFisica();
        pessoa4.setCodigo("203");
        pessoa4.setNome("Pedro");
        pessoa4.setSobrenome("0liveira");
        pessoa4.setIdade(71);
        pessoa4.setRg("9742974794232");
        pessoa4.setCpf("983.324.234-23");


        PessoaFisica pessoa5 = new PessoaFisica();
        pessoa5.setCodigo("204");
        pessoa5.setNome("Augusto");
        pessoa5.setSobrenome("Vieira");
        pessoa5.setIdade(5);
        pessoa5.setRg("34534545543");
        pessoa5.setCpf("138.532.543-23");


        pessoa[0] = pessoa1;
        pessoa[1] = pessoa2;
        pessoa[2] = pessoa3;
        pessoa[3] = pessoa4;
        pessoa[4] = pessoa5;

        for (PessoaFisica pessoaFisica : pessoa) {
            System.out.printf("\nCódigo: %d", pessoaFisica.getCodigo());
            System.out.printf("\nNome: %s", pessoaFisica.getNome());
            System.out.printf("\nSobrenome: %s", pessoaFisica.getSobrenome());
            System.out.printf("\nIdade: %d anos", pessoaFisica.getIdade());
            System.out.printf("\nRG: %s", pessoaFisica.getRg());
            System.out.printf("\nCPF: %s", pessoaFisica.getCpf());
            System.out.println();
        }

    }
}




