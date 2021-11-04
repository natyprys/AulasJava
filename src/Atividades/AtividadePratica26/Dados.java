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


    //Reorganizar Array
    public void reorganiza(int posicao) {
        for (int i = posicao; i < dados.length - 1; i++) {
            this.dados[i] = this.dados[i + 1];
        }
        posicao --;
    }


    //Buscar
    public int contains(Object obj) {
        for (int i = 0; i < dados.length; i++) {
            if (obj.equals(dados[i])) {
                return i;
            }
        }
        return -1;
    }


    //Se existe
    public boolean existe(Object obj){
        int indice = contains(obj);
        if(indice >=0){
            return true;
        }
        return false;
    }

    //verificarTamanhoArray
    private void verificaTamanhoArray(){
        if(posicaoAtual >= this.dados.length){
            int novoTamanho = this.dados.length + 5;
            Object[] dados2 = new Object[novoTamanho];
            for (int i = 0; i < dados.length; i++) {
                dados2[i] =  dados[i];
            }
            dados = dados2;
        }
    }

}
