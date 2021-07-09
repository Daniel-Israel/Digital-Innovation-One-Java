package Exercicio1;

public class Carro {
    private String modelo = "Onix";
    private String marca = "Chevrolet";
    private String maxOcupantes = "5 (cinco)";
    private String quantPortas = "4 (quatro)";

    public String getModelo(){
        return "O modelo é: " + modelo;
    }

    public String getMarca(){
        return "A marca é: " + marca;
    }

    public String getMaxOcupantes(){
        return "O máximo de ocupantes é: " + maxOcupantes;
    }

    public String getQuantPortas(){
        return "A quantidade de portas é: " + quantPortas;
    }
}
