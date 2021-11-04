package modulo1.Atividades.AtividadePratica20;

public class Coordenador extends Funcionario {
    private String cursoCoordenado;
    private Double bonus;

    public void setCursoCoordenado(String cursoCoordenado) {
        this.cursoCoordenado = cursoCoordenado;
    }
    public String getCursoCoordenado() {
        return cursoCoordenado;
    }


    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
    public Double getBonus() {
        return bonus;
    }
}
