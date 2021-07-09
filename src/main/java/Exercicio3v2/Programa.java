package Exercicio3v2;

public class Programa {
    public static void main(String[] args) {

        Funcionarios funcionario = new Funcionarios();

        Gerente gerente = new Gerente();
        Supervisor supervisor = new Supervisor();
        Atendente atendente = new Atendente();

        funcionario.setNome("Daniel");

        gerente.setSalario(2000.00);
        System.out.println("O funcionário: " + funcionario.getNome() + " como gerente tem o salário de: " + gerente.getSalario() + " e o imposto de: " + gerente.calculaimposto());
        supervisor.setSalario(1500.00);
        System.out.println("O funcionário: " + funcionario.getNome() + " como supervisor tem o salário de: " + supervisor.getSalario() + " e o imposto de: " + supervisor.calculaimposto());
        atendente.setSalario(1000.00);
        System.out.println("O funcionário: " + funcionario.getNome() + " como atendente tem o salário de: " + atendente.getSalario() + " e o imposto de: " + atendente.calculaimposto());


    }
}
