import java.util.Scanner;

public class PalindromeUsingRecursion {

    public static boolean checkPalindromeUsingRecursion(String input){
        if(input.length() == 1 || input.isEmpty()){
            return true;
        }
            if(input.charAt(0) == input.charAt(input.length() - 1)){
                return checkPalindromeUsingRecursion(input.substring(1, input.length() -1));
            } else{
                return false;
            }

    }

    public static void main(String args[]){
        System.out.println("enter the string to be checked as palindrome or not");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(" Is it a palindrome ?? " + checkPalindromeUsingRecursion(input));


    }
}
