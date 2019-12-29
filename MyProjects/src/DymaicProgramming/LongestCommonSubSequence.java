package DymaicProgramming;

public class LongestCommonSubSequence {


    ///suppose two strings , findd the length of common subsqeuence between with the two

    //use dynamic programming

    ///dynamic programming : mesn findout sub problems in recursion...to reduce the time complexity and space complexity of a prgram
    ///and use memoization...so store results


    ///first lets us recursion

    /*

    Let X[0...m-1 ] be furst charactere aray , Y[0....n-1] BE SECOND CHARACTERS ARARAY OF LENGTHS M, N
    LCS repersents of two strinfs

   if(X[m-1] == Y[n-1])
   L(X[0...m-1],y[0....N-1]) = 1+ L(X[0...M-2],y[0...N-2]);

   else

   LCS = MAX[L(X[0...m-2],Y[0....n-1)+ L(X[0...m-1],Y[0....n-2])
     */


     static int lcs(char[]X, char[]Y, int m, int n){
        if(m == 0 || n==0 )
            return 0;
        if(X[m-1] ==Y[n-1])
            return 1 + lcs(X,Y, m-1, n-1);
        else{
            return max(lcs(X,Y,m,n-1), lcs(X,Y,m-1,n));
        }
    }

     static int max(int a, int b){
        return  (a > b) ? a: b;
    }

    public static void main(String args[]){
        String x = "AGGTAB";
        String y ="GXTXAYB";

        char[] X = x.toCharArray();
        char[] Y = y.toCharArray();
        int lcs = lcs(X,Y,x.length(),y.length());
        System.out.println("The length of longest common subsequence is ..."+ lcs);

    }
}
