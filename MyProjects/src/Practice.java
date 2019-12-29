public class Practice {



    public static  void convertToBineryString(int number){
        int n = number;
        StringBuilder stringBuilder = new StringBuilder();
        do{
            stringBuilder.append(n % 2);
            n = n/2;

        } while (n > 0);

        System.out.println("The binary representation of number " + number +" is "+ stringBuilder.reverse().toString());
    }

    public static void rightSiftOperation(int number){
        System.out.println("the nunber after right shift is ..."+ String.valueOf(number >>> 1));
    }

    public static int fibonnciSeries (int n){

        if( n == 1  || n == 2){
            return 1;
        }
        return fibonnciSeries(n-1)+ fibonnciSeries(n -2);
    }

    public static void printFiboNacciSeries(int n){
        int fib1 = 1; int fib2 = 1; int fibonacci;
        for(int i = 1 ; i <= n ; i++){
            if(i == 1 || i == 2) {
                System.out.print(1+" ");
            }
                else{
                    fibonacci = fib1 + fib2 ;
                    fib1 = fib2;
                    fib2=fibonacci;
                System.out.print(fibonacci+" ");
                }
            }

    }

    /*
      Method to get number of digits in a numbet
     */
    public static int getNumberOfDigits(int number){

        // first find the number of digits in he number
        int numberOfdigits = 0;

        while ( number > 0){
            numberOfdigits++;
            number = number/10;

        }

       return numberOfdigits;


    }

    public static boolean checkArmStongNumber(int n){
        //get num of digits
        int numOfDigits = getNumberOfDigits(n);
        //System.out.println("the number of digits is ..."+ numOfDigits);
        int temp=n ; int r;int sum=0;

        while(temp > 0){

            r= temp%10;
            sum+=Math.pow(r,numOfDigits);
            temp = temp/10;

        }
        if( sum== n){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        convertToBineryString(100);
        rightSiftOperation(-100);
        System.out.println(fibonnciSeries(12));
        printFiboNacciSeries(12);
        System.out.println(" ");
        System.out.println("the number 407 is it Armstrong? "+checkArmStongNumber(407));
    }
}
