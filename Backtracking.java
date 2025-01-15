import java.util.*;
public class Backtracking {
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
  // public static void findPermutation(String str, String ans) {
  //   // base case
  //   if (str.length() == 0) {
  //     System.out.println(ans);
  //     return;
  //   }
  //   for (int i = 0; i < str.length(); i++) {
  //     char curr = str.charAt(i);
  //     // Substring method cover in String.
  //     // Substring e.g: "abcde" => "ab" + "de": "abde", remove c. (Read:
  //     // Substring method)
  //     String Newstr = str.substring(0, i) + str.substring(i + 1);
  //     findPermutation(Newstr, ans + curr);
  //   }

  //   // work: recursion
  // }
  // public static void main(String args[]) {
  //   String str = "abc";
  //   findPermutation(str, "");
  // }

  // n Queens question:
  public static boolean isSafe(char board[][], int row, int col) {
    // vertical up
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }
    // diagonal left up
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    // diagonal right up
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }
  public static void nQueens(char board[][], int row) {
    // base case
    if (row == board.length) {
      // printBoard(board);
      count++;  //optimization
      return;
    }
    // column loop
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, row, j)) {
        board[row][j] = 'Q';
        nQueens(board, row + 1); // function call
        board[row][j] = 'x';     // Backtracking step
      }
    }
  }
  public static void printBoard(char board[][]) {
    System.out.println("------Chess Board-------");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  static int count = 0;  //optimization 
  public static void main(String args[]) {
    int n = 4;
    char board[][] = new char[n][n];
    // initalise
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = 'x';
      }
    }
    nQueens(board, 0);
    System.out.println("Total ways to solve nQueen: " + count);
  }
}
