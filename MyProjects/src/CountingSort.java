public class CountingSort {


 /* TODO
     Count Sort algorithm is used, sort based on count of the number of times the digit has oocurent in array
     1) Foisrt an count array to sy 256 in length, initialize all its tonents to zero
     2) then find the count of each digit in originaly array
     3) then add the previously oocured digits count, to get accurate repesentation
     4) Now the count indicates the index at which the numbers ahev to placed

  */

    private static void coountSort(int arr[]) {
        int n = arr.length;


    }




    private static void  printArray(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }


    public static void main(String args[]){
        int arr[] = {15,13,12,34,23,25, 43,35,37,56,45,47};
        coountSort(arr);
        printArray(arr);

    }
}
