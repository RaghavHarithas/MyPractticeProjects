package BinaryNumbers;

public class BinaryToDecimalConversion {
    private static double binaryToDecimal(String binary){
        /*
          exmaple Strimg is 1010
          find the length of String

         */
         StringBuilder stringBuilder = new StringBuilder(binary);
        char binaryChara [] = stringBuilder.reverse().toString().toCharArray();
        double decimal =0;
        for(int j=0;j< binary.length();j++){
            int digit = Character.getNumericValue(binaryChara[j]);
            if(digit == 1) {
                System.out.println("the digit is 1 at index "+ j);
                decimal = decimal + Math.pow(2, j);
            }

        }
    return decimal;
    }

    public static void main(String args[]){
        System.out.println(" the decimal of binary number 1010 is "+ new Double(binaryToDecimal("101010")).intValue());
    }
}
