// import java.util.*;
// import java.util.Arrays;
import java.util.Collections;
public class file {

  /********************* BUBBLE SORT ********************/

  /*     public static void BubbleSort(int arr[]){
          for(int i=0; i<arr.length-1; i++){
              int swap = 0;       // tracks the swaps for inner loop
              for(int j=0; j<arr.length-1-i; j++){
                  if(arr[j] > arr[j+1]){
                      //swap
                      int temp = arr[j];
                      arr[j] = arr[j+1];
                      arr[j+1] = temp;
                      swap++;
                  }
              }
          // If no swaps were made, the array is already sorted
          if (swap == 0) break;
          }
      }

      // print
      public static void printArr(int arr[]){
          for(int i=0; i<arr.length; i++){
              System.out.print(arr[i]+" ");
          }
          System.out.println();
      }

      public static void main(String args[]){
          int arr[] = {5, 4, 1, 3, 2};
          BubbleSort(arr);
          printArr(arr);
      } */

  // Optimised solution for the sorted Array [1, 2, 3, 4, 5], T.C => O(n)
  // Above using swap varibale.

  /********************* SELECTION SORT ********************/

  /*     public static void SelectionSort(int arr[]){
          for(int turn = 0; turn < arr.length - 1; turn++){
              int minPosition = turn;
              for(int j = turn+1; j < arr.length; j++){
                  // (> increasing order) : ( < Decreaseing order)
                  if(arr[minPosition] > arr[j]){

                      minPosition = j;
                  }
              }
          // swap
              int temp = arr[minPosition];
              arr[minPosition] = arr[turn];
              arr[turn] = temp;
          }
      }

      // print
      public static void printArr(int arr[]){
          for(int i=0; i<arr.length; i++){
              System.out.print(arr[i]+" ");
          }
          System.out.println();
      }

      public static void main(String args[]){
          int arr[] = {5, 4, 1, 3, 2};
          SelectionSort(arr);
          printArr(arr);
      }  */

  /********************* INSERTION SORT ********************/

  /*     public static void InsertionSort(int arr[]){
          for(int i=0; i < arr.length; i++){
              int current = arr[i];
              int previous = i - 1;

              //finding out the correct position to insert
              // <: Descending Order
              while(previous >= 0 && arr[previous] > current){
                  arr[previous+1] = arr[previous];
                  previous--;
              }

              //Insertion
              arr[previous+1] = current;
          }
      }       */

  // print
  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  /*     public static int compare(int a, int b){
          // a < b: -ve
          // a == b: 0
          // a > b: +ve
          return a - b;
      } */

  /*     public static void main(String args[]){
          int arr[] = {5, 4, 1, 3, 2};
          // InsertionSort(arr);
          // Arrays.sort(arr);
          Arrays.sort(arr, Collections.reverseOrder());
          printArr(arr);
      }   */

  /********************* COUNTING SORT ********************/

  public static void counting_sort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }

    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    // sorting
    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
  }

  public static void main(String args[]) {
    int arr[] = {5, 4, 1, 3, 2};
    counting_sort(arr);
    printArr(arr);
  }
}