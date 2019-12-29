package Internationlization;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFomrat {

    public static void main(String args[]) {


    double number = 100;

    NumberFormat usaFormat = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat frenchFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);


        System.out.println("The usa currency money "+usaFormat.format(number));
        System.out.println("The french currency money "+frenchFormat.format(number));
        System.out.println("The china currency money "+chinaFormat.format(number));

}

}
