package Exercicio3v2;

public class Supervisor extends  Funcionarios{

    public double calculaimposto(){
        return this.getSalario() * 0.0005;
    }
}
