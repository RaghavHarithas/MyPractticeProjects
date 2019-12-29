public class QuickSort

{



/* TODO
    Quick sort use one pivot element , and sorts it around the pivot element
    1) All elemeenst less than pivot are placed on left hand side of pivot, and ell elelemnst gerater than pivot placed on the right hand side of the pivot
    2) Pivot element can be fistrt element, last elemest or miidle lelement of the array   its all about partioning,
    3) Fisrt call the patriooning method wihc partions around the piot, and gives the coorect index of the pivot , placed in the coorect position    now again partion to the left of pivot and and to the right of the pivot

 */

    private static void quickSort(int arr[]) {
        int n = arr.length;


    }




    private static void  printArray(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }


    public static void main(String args[]){
        int arr[] = {15,13,12,34,23,25, 43,35,37,56,45,47};
       quickSort(arr);
        printArray(arr);

    }
}
