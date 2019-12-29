public class MergeSort {





/* TODO
    Merge Sort, assumes iot gets to sorted arrays , sorted around te middle lelement of the array, then combines te two sorted array into one
    1) break the raay tinto parts, one sorted on the lemenst to the left of kiddle element
    2) Seocnd raay sorted on the elemenst on tahe right hand side of middle lelemenet
    3) Then merge thses tow ararays, again take of sorting while maerging

 */

        private static void mergeSort(int arr[]) {
            int n = arr.length;


        }




        private static void  printArray(int arr[]){
            for(int i: arr){
                System.out.print(i+" ");
            }
        }


        public static void main(String args[]){
            int arr[] = {15,13,12,34,23,25, 43,35,37,56,45,47};
            mergeSort(arr);
            printArray(arr);

        }
    }

