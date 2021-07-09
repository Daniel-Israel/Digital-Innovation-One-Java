package Exercicio2;

public class Programa {
    public static void main(String[] args){
        Carro carro = new Carro("Chevrolet", "onix", 2020);

        carro.setVariante("Não sei oq é variante");

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.getVariante());

    }
}
