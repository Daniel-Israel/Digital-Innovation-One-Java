package Exercicio1_list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio1 {

    public static void main(String[] args){

        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        List<Double> notas2 = null;

        System.out.println("Crie uma lista chamada notas2: " +  notas2 + " e coloque todos os elementos da list ArrayList nessa nova lista: ");

        notas2 = notas;

        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da lista sem removê-lo: " + notas2.get(0));

        System.out.println("Mostre a primeira nota da lista removendo-o: " + notas2.remove(0) + notas2);

    }

}
