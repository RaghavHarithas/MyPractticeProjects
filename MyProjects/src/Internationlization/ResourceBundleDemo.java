package Internationlization;


/*

Resource Bumdleis used basically for getting country specific messages
for example each country will ahve a different greeting message, this case all these greet messages can be stroed in proeprty file and this can be picked up
based on language ior country

file forrmates : Messages_<language>_<country>.propeerties

exmple: Messages_en_US.properties
 */

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String args[]){
       ResourceBundle resourceBundleEng =  ResourceBundle.getBundle("Messages",Locale.ENGLISH);
       ResourceBundle resourceBundleIndia = ResourceBundle.getBundle("Messages",Locale.ITALY);


    }
}
