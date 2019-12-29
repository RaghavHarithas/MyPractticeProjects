public class BucketSort {


/// Buckect sort is dsed ...when have a values in range to be sorted...its s useful teckig
    ///firt we cereed n empy buckets
    //then add elemenst in buckets suc has index = n*arr[i]
    //insert at the index
    // then sort each bucket
    ///then add the buckets to the array to obtain sorted array

    private static void bukectSort(int arr[]) {
        int n = arr.length;


    }




    private static void  printArray(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }


    public static void main(String args[]){
        int arr[] = {15,13,12,34,23,25, 43,35,37,56,45,47};
        bukectSort(arr);
        printArray(arr);

    }
}
