public class BuubleSort {

 /// keepong swapping adhacenet elemensts
    //sipelset sort
     static boolean swapped = false;

    private static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }




    private static void  printArray(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }


    public static void main(String args[]){
        int arr[] = {15,13,12,34,23,25, 43,35,37,56,45,47};
        bubbleSort(arr);
        printArray(arr);

    }
}
