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
  // public static boolean isSafe(char board[][], int row, int col) {
  //   // vertical up
  //   for (int i = row - 1; i >= 0; i--) {
  //     if (board[i][col] == 'Q') {
  //       return false;
  //     }
  //   }
  //   // diagonal left up
  //   for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
  //     if (board[i][j] == 'Q') {
  //       return false;
  //     }
  //   }
  //   // diagonal right up
  //   for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
  //   {
  //     if (board[i][j] == 'Q') {
  //       return false;
  //     }
  //   }
  //   return true;
  // }
  // public static void nQueens(char board[][], int row) {
  //   // base case
  //   if (row == board.length) {
  //     // printBoard(board);
  //     count++;
  //     return;
  //   }
  //   // column loop
  //   for (int j = 0; j < board.length; j++) {
  //     if (isSafe(board, row, j)) {
  //       board[row][j] = 'Q';
  //       nQueens(board, row + 1); // function call
  //       board[row][j] = 'x';     // Backtracking step
  //     }
  //   }
  // }
  // public static void printBoard(char board[][]) {
  //   System.out.println("------Chess Board-------");
  //   for (int i = 0; i < board.length; i++) {
  //     for (int j = 0; j < board.length; j++) {
  //       System.out.print(board[i][j] + " ");
  //     }
  //     System.out.println();
  //   }
  // }
  // static int count = 0;
  // public static void main(String args[]) {
  //   int n = 4;
  //   char board[][] = new char[n][n];
  //   // initalise
  //   for (int i = 0; i < n; i++) {
  //     for (int j = 0; j < n; j++) {
  //       board[i][j] = 'x';
  //     }
  //   }
  //   nQueens(board, 0);
  //   System.out.println("Total ways to solve nQueen: " + count);
  // }

  // Grid ways
  //  public static int GridWays(int i, int j, int n, int m){
  //  /* i,j: cell and nxm row and cols */
  //  //base case
  //  if(i == n-1 && j == m-1){   //condition for last cell
  //    return 1;
  //  } else if(i==n || j == m){  //boundary cross condition
  //    return 0;
  //  }

  // //recursive relation
  // int w1 = GridWays(i+1, j, n, m);
  // int w2 = GridWays(i, j+1, n, m);
  // return w1 + w2;

  // }
  // public static void main(String args[]){
  //   int n = 3;
  //   int m = 3;
  //   System.out.println(GridWays(0, 0, n, m));
  // }

  // Sudoku Problem
  public static boolean isSafe(int Sudoku[][], int row, int col, int digit) {
    // column
    for (int i = 0; i <= 8; i++) {
      if (Sudoku[i][col] == digit) {
        return false;
      }
    }

    // row
    for (int j = 0; j <= 8; j++) {
      if (Sudoku[row][j] == digit) {
        return false;
      }
    }

    // grid
    int sr = (row / 3) * 3; // starting row
    int sc = (col / 3) * 3; // starting col
    for (int i = sr; i < sr + 3; i++) {
      for (int j = sc; j < sc + 3; j++) {
        if (Sudoku[i][j] == digit) {
          return false;
        }
      }
    }
    return true;
  }
  public static boolean sudokuSolver(int Sudoku[][], int row, int col) {
    // base case
    if (row == 9 && col == 0) {
      return true;
    }
    // else if (row == 9) {
    //   return false;
    // }
    // recursion
    int nextRow = row, nextCol = col + 1;
    if (col + 1 == 9) {
      nextRow = row + 1;
      nextCol = 0;
    }
    if (Sudoku[row][col] != 0) {
      return sudokuSolver(Sudoku, nextRow, nextCol);
    }
    for (int digit = 1; digit <= 9; digit++) {
      if (isSafe(Sudoku, row, col, digit)) {
        Sudoku[row][col] = digit;
        if (sudokuSolver(Sudoku, nextRow, nextCol)) {
          return true;
        }
        Sudoku[row][col] = 0;
      }
    }
    return false;
  }
  public static void printSudoku(int Sudoku[][]) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(Sudoku[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]) {
    int Sudoku[][] = {
        {0, 0, 8, 0, 0, 0, 0, 0, 0}, {9, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 0, 4, 1, 9, 0}, {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6, 0}, {9, 6, 0, 4, 0, 5, 3, 0, 0},
        {0, 3, 0, 0, 7, 2, 0, 0, 4}, {0, 4, 9, 0, 3, 0, 0, 5, 7},
        {8, 2, 7, 0, 0, 9, 0, 1, 3},
    };

    if (sudokuSolver(Sudoku, 0, 0)) {
      System.out.println("solution exists");
      printSudoku(Sudoku);
    } else {
      System.out.println("solution does not exists");
    }
  }
}
