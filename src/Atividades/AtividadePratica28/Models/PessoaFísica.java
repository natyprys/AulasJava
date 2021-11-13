package AtividadePratica28.Models;

import AtividadePratica28.Models.Pessoa;

public class PessoaFísica extends Pessoa {
        public String cpf;

        @Override
        public String toString() {
          return "----------------- Pessoa Física -----------------"+
                  "\n\tNome = " + this.nome +
                    "\n\tCPF = " + this.cpf +
                    "\n\tCEP = " + this.endereco.cep +
                    "\n\tEndereço = "+ this.endereco.endereco +
                    "\n\tCidade = " + this.endereco.cidade +
                    "\n\tEstado =" + this.endereco.estado +
                    "\n";
        }
}
