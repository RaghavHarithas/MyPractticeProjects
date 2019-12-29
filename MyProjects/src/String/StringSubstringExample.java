package String;

public class StringSubstringExample {



    public static void  getSessionId(String routeHeader){
        String route = routeHeader.replace("<","");
        route = route.replace(">","");
        String sessionId = null;
       String roueArray[] = route.split(";");
       if(roueArray != null && roueArray.length >0 ){
       for(String s2: roueArray){
           if(s2.contains("sessionId")){
               int index= s2.indexOf("=");
               sessionId = s2.substring(index+1);
           }
       }

       }

       System.out.println("The sessionId is "+ sessionId);




    }


    public static void main(String args[]){
        String rouetHeadeer = "<sip:15.112.158.68:5060;sessionId=1234;lr>";
        getSessionId(rouetHeadeer);
    }
}
