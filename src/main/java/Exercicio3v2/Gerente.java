package Exercicio3v2;

public class Gerente extends Funcionarios{

    public double calculaimposto(){
        return this.getSalario() * 0.001;
    }

}
