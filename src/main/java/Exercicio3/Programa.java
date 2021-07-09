package Exercicio3;

public class Programa {
    public static void main(String[] args) {

        Funcionarios funcionario = new Funcionarios();

        Gerente gerente = new Gerente();
        Supervisor supervisor = new Supervisor();
        Atendente atendente = new Atendente();

        funcionario.setNome("Daniel");

        System.out.println("O funcionário: " + funcionario.getNome() + "Como gerente tem o salário de: " + gerente.getSalario() + "E o imposto de: " + gerente.calculaimposto());
        System.out.println("O funcionário: " + funcionario.getNome() + "Como supervisor tem o salário de: " + supervisor.getSalario() + "E o imposto de: " + supervisor.calculaimposto());
        System.out.println("O funcionário: " + funcionario.getNome() + "Como atendente tem o salário de: " + atendente.getSalario() + "E o imposto de: " + atendente.calculaimposto());


    }
}
