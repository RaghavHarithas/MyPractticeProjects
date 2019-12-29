import java.util.Scanner;

public class PrimeNumbers {



  public void  printPrimeNumbers(int n){
      boolean isPrime= false;
      for(int i=4;i<=n;i++ ){

          for(int j=2;j<= Math.sqrt(i);j++){
              if(i%j == 0){
                  isPrime=false;
                  break;
              }else{
                  isPrime = true;
              }
          }
          if(isPrime){
              System.out.print(i+" ");
              isPrime=false;
          }
      }

  }

  public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      //how many prime numbers to print
      int n = scanner.nextInt();
      System.out.print(1+ " "+ 3 + " ");
      PrimeNumbers primeNumbers = new PrimeNumbers();
      primeNumbers.printPrimeNumbers(n);
  }
}


