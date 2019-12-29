package DymaicProgramming;



/*
 LCS : Longest Common Subsequence

 longest ommon subsequence is a sequnec e oc haracters common to both strings
 not necessarily contigious

 Let X be staring, Let Y be another string ...tow of whom lcs needs to be found out

 Let m the length of X, length n be ith length of y
 LCS(X, Y) repersensemt the length of LCS
 so
 X[0..m-1] : repesrent character of string x, Y[0...n-1], repersent caharcter array of String Y
 if(X[m-1] == Y[n-1]){
 LCS(X[0..m-1],Y[0..n-1]) =1 + LCS(X[0..m-2],Y[0..n-2]);
 else
 LCS[X[0..m-1],Y[0..n-1]) = Max(LCS(X[0..m-1],Y[0..n-2]),LCS(X[0..m-2],Y[0..n-1]));
 }
 */

public class LCSRecursion {

    private static int max(int a, int b){
        return ( a > b) ? a : b;
    }

    private static  int lcs(char[]X, char[]Y, int m, int n){

        if(m==0 || n==0)
            return 0;

            if( m == 1 || n==1 )
                return 1;

            if(X[m-1] == Y[n-1])
                return 1 + lcs(X,Y,m-1,n-1);
            else
                return max(lcs(X,Y,m,n-1),lcs(X,Y,m-1,n));


    }

    public static void main(String args[]){
        String X= "AGGTAB";
        String Y = "GXTXAYB";

        System.out.println("The length of LCS betwwen X, Y is"+ lcs(X.toCharArray(),Y.toCharArray(),X.length(),Y.length()));
    }
}
