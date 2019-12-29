package Internationlization;

/*
  The way numbers are  defined different from country to conutry

 */

import java.text.NumberFormat;
import java.util.Locale;

public class NumberInternationalization {

    public static void main(String args[]){

        double number = 100.4646;

        NumberFormat usaFormat = NumberFormat.getNumberInstance(Locale.US);
        NumberFormat frenchFormat = NumberFormat.getNumberInstance(Locale.FRANCE);
        NumberFormat chinaFormat = NumberFormat.getNumberInstance(Locale.CHINA);

        System.out.println("The usa format "+ usaFormat.format(number));
        System.out.println("The french format "+ frenchFormat.format(number));
        System.out.println("The china format "+ chinaFormat.format(number));




    }
}
