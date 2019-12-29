import java.util.function.Function;

public class LambdaExpressions {



    interface Functional1 {
        void opeartion(int x);

        default void function(){
            System.out.println("Hello");
        }
    }

    interface Functioninter1 {
        int operation(int x, int y);
    }
    interface FunctionInter2 {
        void sayMessage(String message);
    }
    private int operation(int x, int y, Functioninter1 functioninter1){
        return functioninter1.operation(x,y);
    }

    public static void main(String args[]){
        Functional1 functional1 = (int x) -> System.out.println(2*x);
        functional1.opeartion(5);

        Functioninter1 functioninter1 = (int x, int y) -> x+ y;
        Functioninter1 functioninter11 = (int x , int y) -> x* y;
        LambdaExpressions lambdaExpressions = new LambdaExpressions();

        System.out.println("Addition of two number 5, 10 is "+ lambdaExpressions.operation(5,10,functioninter1));
        System.out.println("Multiplication of two numbers is 5, 10 is "+ lambdaExpressions.operation(5,10,functioninter11));
        FunctionInter2 functionInter2 = message -> System.out.println("Hello "+ message);
        functionInter2.sayMessage("Geek");

    }

}
