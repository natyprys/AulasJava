package modulo1.aula9;

public class a9_2_metodos_nome {
    public static void main(String []args){

        //Chamando o metoso imprimir_nome e passando dois argumentos do tipo string
        imprimir_nome( "Nathalia", "Assunção");
        // argumentos
    }

    // Metodo imprimie nome- que recebe dois parametros
    static void imprimir_nome(String nome , String sobrenome){
        System.out.printf("%s %s", nome, sobrenome);
    }

}

