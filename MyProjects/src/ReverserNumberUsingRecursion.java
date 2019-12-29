import java.util.Scanner;

public class ReverserNumberUsingRecursion {

    public static  void reverseNumber(int number){
        if(number == 1 ) {
            System.out.print(number);
            return;
        } else if(number == 0){
            return;
        }
        System.out.print(number%10);

        reverseNumber(number/10);
    }


    public static void main(String args[]){
        System.out.println("Enter the number to be reversed");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("the reveresed number is ");
        reverseNumber(number);


    }
}
