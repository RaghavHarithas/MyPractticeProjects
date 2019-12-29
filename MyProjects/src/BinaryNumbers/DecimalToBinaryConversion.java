package BinaryNumbers;

public class DecimalToBinaryConversion {

    private static String convertDecimalToBinary(int decimal){

        if(decimal == 1){
            return "1";
        }else {
            StringBuilder stringBuilder = new StringBuilder("");

            int numner = decimal;
            do {
                int remainder = numner % 2;
                System.out.println("the binary bit is "+remainder);
                stringBuilder.append(remainder);
                numner = numner / 2;
            } while (numner > 1);

            stringBuilder.append("1");
            return stringBuilder.reverse().toString();

        }
    }

    public static void main(String args[]){
        System.out.println("the binary represnetation is "+ convertDecimalToBinary(10));
    }
}
