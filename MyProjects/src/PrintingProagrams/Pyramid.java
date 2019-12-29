package PrintingProagrams;

public class Pyramid {

    private static void  printStarPyramidUsingStringBuilder(int n){
        StringBuilder stringBuilder = new StringBuilder("*");
        for(int i=1;i<=n;i++){
            System.out.println(stringBuilder);
            stringBuilder.append("*");
        }
    }
    private static void printUsingForLoops(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        //printStarPyramidUsingStringBuilder(100);
        printStarPyramidUsingStringBuilder(100);

    }
}
