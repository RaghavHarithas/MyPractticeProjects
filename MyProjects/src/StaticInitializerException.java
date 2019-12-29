import java.util.Arrays;
import java.util.Collection;

public class StaticInitializerException {

    private static Collection<Data<?>> TOC = Arrays.asList(new Data<?>[]{
            Data.CG_ENCOUNTERED, Data.IP_SSP_CAPABILITIES, Data.IP_AVAILABLE, Data.SERVICE_INTERCATION_INDICATORS, Data.SERVICE_INTERCATION_INDICATORS2, Data.ADDITIONAL_CALLING_PARTY_NUMBER, Data.FORWARD_CALL_INDICATORS,



    });

    public static  Collection<Data<?>> TOC2 = Arrays.asList(new Data<?>[]{
            Data.SERVICE_KEY, Data.CALLING_PARTYS_CATEGORY, Data.LOCATION_NUMBER, Data.BEARER_CAPABILITY, Data.BEARER_CAPABILITY, Data.EVENT_TYPE_BCSM, Data.REDIRECTING_PARTY_ID,
            Data.REDIRECTING_INFORMATION

            // TODO extend that list according to getValue() implementation
    });

    static{
      try {
          //TOC.addAll(TOC2);


          for(Data data : TOC2){
              System.out.println("the data object is "+ data.toString());
              TOC.add(data);
          }
      }catch(Exception e){
          e.printStackTrace();
          System.out.println("the exception e is "+ e.getMessage());
      }

    }

    public static void main(String args[]){
        System.out.println("Hello....");
    }


}
