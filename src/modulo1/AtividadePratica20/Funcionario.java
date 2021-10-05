package modulo1.AtividadePratica20;

public class Funcionario extends Pessoa{
    private double salario;
    private String departamento;

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }


    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }


}
