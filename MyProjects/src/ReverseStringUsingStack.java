import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {

    public static void reverseStringByUsingStack(String input){

        Stack stack = new Stack();
        String reverse = "";
        //System.out.println("the length of String is "+ input.length());
        int initialIndex = input.length() - 1;
        for(int i = 0; i <= initialIndex; i++){
            char pushed= input.charAt(i);
           // System.out.println("the charcater pushed is "+pushed);
;            stack.push(pushed);
        }
        //System.out.println("the stack size is ..."+ stack.size());
        while(!stack.empty()) {
             char pooped = (char) stack.pop();
            //System.out.println("the stack contents are  " + pooped);
            reverse = reverse + pooped;
        }
        System.out.println("The reversed string is " +reverse);

    }

    public static void main(String args[]){
        System.out.println("Enter the input string");
        Scanner scanner = new Scanner(System.in);
        reverseStringByUsingStack(scanner.next());
    }
}
