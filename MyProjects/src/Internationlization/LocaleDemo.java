package Internationlization;

import java.util.Locale;

/*
 Ineternationalization is process adaptig to diferenet langauges and regions...java rpovdes a powerful tool

  its important display message in specific lanaguage in the spefic regions
  through internationalization we can achieve this
  local class is very importatt in this purpse

  locale class

  #######Constrcutors#####
  Language(String language)
  Languahe(String language, String country)
  Language(String language, String country, variant)


  #### Methods #######
  getDefault() : default locale
  getDisplayLanguage(): get the lanaguage
  getDisplayCountry()" get the dsiaply country
  getDisplayVrainat : get the variant
  getISOCoutry() : country in iso3 format
  getISOLanguage(): Language in ISO3 Forat
  getISOVraiant: vraiant in iso foramty

 */

public class LocaleDemo {

    public static void main(String args[]){
        Locale locale = Locale.getDefault();
        System.out.println("the langauge "+ locale.getDisplayLanguage());
        System.out.println("the country "+ locale.getDisplayCountry());
        System.out.println("the vraiant "+ locale.getDisplayVariant());
        System.out.println("the iso3 country"+ locale.getISO3Country());
        System.out.println("the iso3 lanaguage"+ locale.getISO3Language());
    }
}
