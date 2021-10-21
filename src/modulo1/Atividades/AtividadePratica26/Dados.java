package modulo1.Atividades.AtividadePratica26;

public class Dados {
    int posicaoAtual = 0;
    int tamanhoAtual = 5;
    Object[] dados;

    public Dados() {
        this.dados = new Object[tamanhoAtual];
    }

    //Tamanho
    public int size() {
        return posicaoAtual;
    }


    //Adicionar
    public String add(Object obj) {
        String mensagem ="Dados salvos com sucesso" ;

        if (posicaoAtual < dados.length) {
            dados[posicaoAtual] = obj;
            posicaoAtual++;
        } else {
            tamanhoAtual = tamanhoAtual + 5;
            Object[] dados2 = new Object[tamanhoAtual];

            for (int i = 0; i < dados.length; i++) {
                dados2[i] = dados[i];
            }
            dados = dados2;
        }
        return mensagem;
    }


    //Remover
    public String remove(Object obj) {
        for (int i = 0; i < dados.length; i++) {
            if (dados[i].equals(obj)) {
                reorganiza(i);
                posicaoAtual --;
                return "Dado removido com sucesso";
            }
        }
        return "Não foi encontrado dado";
    }


    //Reorganizar
    public void reorganiza(int posicao) {
        for (int i = posicao; i < dados.length - 1; i++) {
            this.dados[i] = this.dados[i + 1];
        }
    }


    //Se contem
    public boolean contains(Object obj) {
        for (int i = 0; i < posicaoAtual; i++) {
            if (dados[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }


}
