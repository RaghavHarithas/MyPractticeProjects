package Internationlization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateInternalization {

    public static void main(String args[]){

        Date date = new Date();
        DateFormat engFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.ENGLISH);
        DateFormat frenchFormat  = DateFormat.getDateInstance(DateFormat.DEFAULT,Locale.FRANCE);
        DateFormat chinaFormat = DateFormat.getDateInstance(DateFormat.DEFAULT,Locale.CHINESE);
        System.out.println("US DATE FORMAT IS "+ engFormat.format(date));
        System.out.println("French DATE FORMAT IS "+ frenchFormat.format(date));
        System.out.println("Chinesse DATE FORMAT IS "+ chinaFormat.format(date));

    }
}
