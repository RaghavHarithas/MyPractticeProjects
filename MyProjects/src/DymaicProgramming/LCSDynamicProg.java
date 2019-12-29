package DymaicProgramming;

/*
 Two proeprties of Dynamic Profraamimmg
 1) Overallping subporblems
 2) Optimal Substrcuture

 1) DP is used to solve the problem of recusrion...where multiple usb problems are recalculated ..In recursion we get exopnential time complexity., while with DP we get liner complexity

 we use memzization,storing the previous results

 there are two appriaches top down...and bottom up approach
 */

public class LCSDynamicProg {

    private static int max(int a,int b){
        return (a > b) ? a : b;
    }

    private  static int lcs(char X[], char Y [], int m, int n){
        int lcs[][] = new int[m+1][n+1];

        if( m== 0 || n ==0 )
            return 0;
            if(m == 1 || n == 1)
                return 1;
            for( int i=0;i<=m;i++){
                for(int j = 0;j<=n;j++){
                   if(i == 0 || j == 0)
                       lcs[i][j] =0;
                   else if(X[i-1] == Y[j-1])
                       lcs[i][j] = 1 + lcs[i-1][j-1];

                   else
                       lcs[i][j] = max(lcs[i][j-1],lcs[i-1][j]);

                }
            }

            return lcs[m][n];

    }

    public static void main(String args[]){
        String X= "AGGTAB";
        String Y = "GXTXAYB";

        System.out.println("The length of LCS betwwen X, Y is"+ lcs(X.toCharArray(),Y.toCharArray(),X.length(),Y.length()));
    }
}
