package Exercicio3_date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Exercicio3 {

    public static void main(String[] args){

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:MMMMM");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);

    }
}
