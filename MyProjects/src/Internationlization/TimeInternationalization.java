package Internationlization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeInternationalization {

    public static void main(String args[]){
         DateFormat french = DateFormat.getTimeInstance(DateFormat.DEFAULT, Locale.FRANCE);
        DateFormat eng =  DateFormat.getTimeInstance(DateFormat.DEFAULT, Locale.ENGLISH);
        DateFormat chinese =  DateFormat.getTimeInstance(DateFormat.DEFAULT, Locale.CHINESE);

        Date date = new Date();
        System.out.println("The us timeformat is "+ eng.format(date));
        System.out.println("The french timeformat is "+ french.format(date));
        System.out.println("The china timeformat is "+ chinese.format(date));




    }
}
