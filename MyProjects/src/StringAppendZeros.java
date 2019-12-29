



public class StringAppendZeros {


    static  String giveAppendedString(String input, int maxLength) {



    //int length = 15;
    String append = "";

        for(int i =0 ;i< maxLength- input.length();i++){
           append =  append.concat("0");

        }

     append = append.concat(input);

        return append;


}

  static String convertHexToDecimal(String hex) throws NumberFormatException{
        System.out.println("the string value is "+ hex);
    return String.valueOf(Integer.parseInt(hex,16));
  }


    public static void main(String args[]) {


   String appendedString = giveAppendedString("xxxx",10);
   System.out.println(appendedString);
   //byte value = 0xD8;

  // System.out.println(String.valueOf(value));


}
}
