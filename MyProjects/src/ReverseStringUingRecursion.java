import java.util.Scanner;

public class ReverseStringUingRecursion {

    public static String reverseStringRecursion(String input){
        if(input.length() == 1 || input.isEmpty()){
            return input;
        }else{
            return input.charAt(input.length() - 1) + reverseStringRecursion(input.substring(0, input.length() -1));
        }
    }
    public static void main(String args[]){
//        System.out.println("Enter the string to be reversed");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//        System.out.println("Reversed String for input "+ input + " is "+ reverseStringRecursion(input));

        System.out.println("Enter the line text to be reversed");
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[]  inputWordArray = inputLine.split(" ");
        System.out.println("Reversed String for input "+ inputLine + " is ");
        for(String input : inputWordArray) {
            System.out.print(reverseStringRecursion(input) + " ");
        }




    }
}
