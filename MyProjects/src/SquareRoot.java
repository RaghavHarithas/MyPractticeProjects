public class SquareRoot {



    /* find q=square root of numner */
    private static float perfectsquareRoot(int n){
        float sqrt =0;
        int lastGuess = 0;
        for(int guess=1; guess*guess <= n ; guess++){
             lastGuess = guess;
            if(guess * guess == n){
                /* found match */
                sqrt = guess;
                break;
            }


        }

        if(sqrt > 0){
            /* perfect square */
            return sqrt;
        }else{
            //re compute sqrt
            System.out.println("The last guess is "+ lastGuess);
            System.out.println(" Recomputing the nearest square root ");
            sqrt = recomputeSquareRoot(n,lastGuess);
            return sqrt;

        }


    }

    private static  float recomputeSquareRoot(int n, int lastGuess){
        float sqrt = 0;
        float nearSquareRoot= 0;
        for(float i = lastGuess; i*i<=n;i+=0.1){
            nearSquareRoot = i;
            if(i *i == n){
                sqrt = i;
                break;
            }
        }
        if(sqrt == 0){
            sqrt = nearSquareRoot;
        }
        return sqrt;
    }



    public static void main(String args[]){
        int n = 35;
        float sqrt = perfectsquareRoot(n);
        System.out.println("The square root of "+n +" is "+ sqrt);
        System.out.println(" revaidating is jwther it exact "+ sqrt * sqrt);


    }
}
