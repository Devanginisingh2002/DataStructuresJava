import java.util.*;
public class file1 {
  /*
  //  Backtracking on Arrays
  public static void changeArr(int arr[], int i, int val) {
    // base case
    if (i == arr.length) {
      printArr(arr);
      return;
    }

    // work: recursion
    arr[i] = val;
    changeArr(arr, i + 1, val + 1);
    arr[i] = arr[i] - 2;
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    int arr[] = new int[5];
    changeArr(arr, 0, 1);
    printArr(arr);
  } */

  // Subset's String
  // public static void findSubset(String str, String ans, int i) {
  //   // base case
  //   if(i == str.length()){
  //     if(ans.length() == 0){
  //       System.out.println("null");
  //     }else {
  //       System.out.println(ans);
  //     }
  //     return;
  //   }
  //   // work: recursion
  //   // Yes Choice
  //   findSubset(str, ans+str.charAt(i), i+1);
  //   // No Choice
  //   findSubset(str, ans, i+1);
  // }
  // public static void main(String args[]) {
  //   String str = "abc";
  //   findSubset(str, "", 0);
  // }

  // find and print permutations
  public static void findPermutation(String str, String ans) {
    // base case
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }
    for (int i = 0; i < str.length(); i++) {
      char curr = str.charAt(i);
      // Substring method cover in String.
      // Substring e.g: "abcde" => "ab" + "de": "abde", remove c. (Read:
      // Substring method)
      String Newstr = str.substring(0, i) + str.substring(i + 1);
      findPermutation(Newstr, ans + curr);
    }

    // work: recursion
  }
  public static void main(String args[]) {
    String str = "abc";
    findPermutation(str, "");
  }
}