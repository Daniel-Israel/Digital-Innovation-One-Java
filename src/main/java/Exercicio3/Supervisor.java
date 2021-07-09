package Exercicio3;

public class Supervisor extends  Funcionarios{

    private double salario = 1500.00;

    public double getSalario(){
        return salario;
    }

    public double calculaimposto(){
        return this.getSalario() * 0.0005;
    }
}
