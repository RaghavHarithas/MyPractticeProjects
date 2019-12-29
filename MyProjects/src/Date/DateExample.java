package Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateExample {

    public static void main(String args[]) throws Exception{

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss.SSSSSSSSS z");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        Date date = new Date();
        try{
            String formatted_date = simpleDateFormat.format(date);
            System.out.println("The formatted date is "+ formatted_date);


        }catch(Exception e){
            System.out.println("Exception Caught");
            e.printStackTrace();
        }

    }
}