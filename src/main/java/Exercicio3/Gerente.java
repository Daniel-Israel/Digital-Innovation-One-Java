package Exercicio3;

public class Gerente extends Funcionarios{

    private double salario = 2000.00;

    public double getSalario(){
        return salario;
    }

    public double calculaimposto(){
        return this.getSalario() * 0.001;
    }

}
