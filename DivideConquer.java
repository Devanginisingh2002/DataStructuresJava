import java.util.*;
public class DivideConquer {

  /********************* MERGE SORT *********************/

  // print array
  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // merge sort, recursive function
  public static void mergeSort(int arr[], int si, int ei) {
    // Base case
    if (si >= ei) {
      return;
    }

    // work
    int mid = si + (ei - si) / 2; // (si+ei)/2
    mergeSort(arr, si, mid);      //  left part
    mergeSort(arr, mid + 1, ei);  // right part
    merge(arr, si, mid, ei);
  }
  // This part is written, to merge left and right part of the code.
  public static void merge(int arr[], int si, int mid, int ei) {
    int temp[] =
        new int[ei - si +
                1];  // leftSide(0,3)=4 rightSide(4,6)=3 -> [ei-si+1] => 6-0+1
    int i = si;      // iterator for left part
    int j = mid + 1; // iterator for right part
    int k = 0;       // iterator for temp array

    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    // left part
    while (i <= mid) {
      temp[k++] = arr[i++];
    }

    // right part
    while (j <= ei) {
      temp[k++] = arr[j++];
    }

    // copy temp to original array
    for (k = 0, i = si; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }
  }

  // main function
  public static void main(String args[]) {
    int arr[] = {6, 3, 9, 5, 2, 8};
    mergeSort(arr, 0, arr.length - 1);
    printArray(arr);
  }

  /*************** QUICK SORT ***********************/
  // print function
  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Recursive function
  public static void quickSort(int arr[], int si, int ei) {
    // Base case
    if (si >= ei) {
      return;
    }
    // pivot: last element
    int pivot_index = partition(arr, si, ei);
    quickSort(arr, si, pivot_index - 1); // left
    quickSort(arr, pivot_index + 1, ei); // right
  }

  public static int partition(int arr[], int si, int ei) {
    int pivot = arr[ei];
    int i = si - 1; // to make place for else smaller than pivot, i = -1

    for (int j = si; j < ei; j++) {
      if (arr[j] <= pivot) {
        i++;

        // swap
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    i++;
    // swap
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
  }

  public static void main(String args[]) {
    int arr[] = {6, 3, 9, 8, 2, 5};
    quickSort(arr, 0, arr.length - 1);
    printArr(arr);
  }

  /********************* SEARCH IN ROTATED SORTED ARRAY ******************/
  public static int search(int arr[], int tar, int si, int ei) {
    // base case
    if (si > ei) {
      return -1;
    }

    // work
    int mid = si + (ei - si) / 2; // (si + ei)/2

    // case found
    if (arr[mid] == tar) {
      return mid;
    }

    // mid on L1
    if (arr[si] <= arr[mid]) {
      // case a: left
      if (arr[si] <= tar && tar <= arr[mid]) {
        return search(arr, tar, si, mid - 1);
      } else {
        // case b: right
        return search(arr, tar, mid + 1, ei);
      }
    }

    // mid on L2
    else {
      // case c: right
      if (arr[mid] <= tar && tar <= arr[ei]) {
        return search(arr, tar, mid + 1, ei);
      } else {
        // case d: left
        return search(arr, tar, si, mid - 1);
      }
    }
  }
  public static void main(String args[]) {
    int arr[] = {4, 5, 6, 7, 0, 1, 2};
    int target = 0; // output: --> 4
    int tarIdx = search(arr, target, 0, arr.length - 1);
    System.out.println(tarIdx);
  }
}