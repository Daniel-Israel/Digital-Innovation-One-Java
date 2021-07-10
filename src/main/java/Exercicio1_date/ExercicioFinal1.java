package Exercicio1_date;

import java.util.Date;

public class ExercicioFinal1 {

    public static void main(String[] args){

        Date datadenasc = new Date(173059200000L);
        Date datacomparacao = new Date(173664000000L);

        int comparacao = datadenasc.compareTo(datacomparacao);

        System.out.println(comparacao);

    }

}
