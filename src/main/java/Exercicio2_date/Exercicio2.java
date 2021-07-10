package Exercicio2_date;

import java.util.Calendar;

public class Exercicio2 {

        public static void main(String[] args){

            Calendar dataatual = Calendar.getInstance();
            Calendar datadevenc = dataatual;

            datadevenc.add(Calendar.DATE, 10);

            System.out.println("A data de vencimento é : " + datadevenc.getTime());

            datadevenc.add(Calendar.DATE, 1);

            System.out.println("Caso essa data seja sábado você tem até o dia: " + datadevenc.getTime());

            datadevenc.add(Calendar.DATE, 1);

            System.out.println("Caso essa data seja domingo você tem até o dia: " + datadevenc.getTime());


        }

}
