package Exercicio3;

public class Atendente extends Funcionarios{

    private double salario = 1000.00;

    public double getSalario(){
        return salario;
    }

    public double calculaimposto(){
        return this.getSalario() * 0.0001;
    }
}
