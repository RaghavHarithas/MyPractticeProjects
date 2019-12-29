public class InsertionSort {

//    int arr[] = {15,13,12,34,23,26,56,45,48,65,53,54};
    //inertion sort
    //is musch like card game
    // when u play with ards...sawp one y one
    //selecyt a key and checj if key is in rightt place, if not keep sawpping

   private static void insertionSort(int arr[]){
       for(int i=1;i<arr.length;i++){
           int key= arr[i];
           int j= i-1;
           while(j >= 0  && (arr[j] > key)){
               arr[j+1] = arr[j];
               j--;

           }
           arr[j+1] = key;
       }
   }

   private static void printArray(int arr[]){
       for(int i: arr){
           System.out.print(i+" ");
       }
   }




   public static void main(String args[]){

       int arr[] = {15,13,12,34,23,26,56,45,48,65,53,54};

       insertionSort(arr);
       printArray(arr);


   }

}
