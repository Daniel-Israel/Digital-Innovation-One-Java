package Exercicio4_date;

import java.time.LocalDateTime;


public class Exercicio4 {

    public static void main(String[] args){

        LocalDateTime data;
        data = LocalDateTime.of(2010,05,15,10,00);
        // 15/05/2010 10:00:00
        System.out.println(data);

        LocalDateTime novadata = data.plusYears(4).plusMonths(6).plusHours(13);
        // 4 anos 6 meses e 13 horas
        System.out.println(novadata);

    }
}
