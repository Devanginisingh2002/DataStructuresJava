import java.util.*;
public class twoD {

  /*
    public static void main(String args[]) {

      // create 2D matrix (2D array) 3x3
      int matrix[][] = new int[3][3];
      int n = matrix.length;    // row
      int m = matrix[0].length; // column

      Scanner sc = new Scanner(System.in);
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          matrix[i][j] = sc.nextInt();
        }
      }

      // output
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }

      searchElement(matrix, 5);
    }

        //If you want to search particular element in a matrix, for a cell.
      public static boolean searchElement(int matrix[][], int key){
          for(int i=0; i < matrix.length; i++){
              for(int j=0; j < matrix[0].length; j++){
                  if(matrix[i][j] == key){
                      System.out.println("Element found at cell: (" + i + "," +
    j + ")"); return true;
                  }
              }
          }
          System.out.println("key not found");
          return false;
      }

      */

  // Spiral Matrix question:
  /*  public static void spiralMatrix(int matrix[][]) {
      int StartRow = 0;
      int StartCol = 0;
      int endRow = matrix.length - 1;
      int endCol = matrix[0].length - 1;

      while (StartRow <= endRow && StartCol <= endCol) {
        // top boundary
        for (int j = StartCol; j <= endCol; j++) {
          System.out.print(matrix[StartRow][j] + " ");
        }
        // right boundary
        for (int i = StartRow + 1; i <= endRow; i++) {
          System.out.print(matrix[i][endCol] + " ");
        }
        // bottom boundary
        for (int j = endCol - 1; j >= StartCol; j--) {
          if (StartRow == endRow) {
            break;
          }
          System.out.print(matrix[endRow][j] + " ");
        }
        // left boundary
        for (int i = endRow - 1; i >= StartRow + 1; i--) {
          if (StartCol == endCol) {
            break;
          }
          System.out.print(matrix[i][StartCol] + " ");
        }

        StartCol++;
        StartRow++;
        endCol--;
        endRow--;
      }
      System.out.println();
    }
  */

  // Diagonal Sum

  // Brute force approach: 0(n^2)
  /* public static int DiagonalSum(int matrix[][]){
    int sum = 0;
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
        if(i == j){
          sum = sum + matrix[i][j];
        }
        else if(i + j == matrix.length - 1){
          sum = sum + matrix[i][j];
        }
      }
    }
    return sum;
  } */

  /* Better Approach O(n) */

  // public static int DiagonalSum(int matrix[][]){
  //   int sum = 0;
  //   for(int i = 0; i<matrix.length; i++){
  //     //primary diagonal
  //     sum += matrix[i][i];
  //     //secondary diagonal
  //     if(i != matrix.length - 1 - i)  // i is not equal to j
  //       sum += matrix[i][matrix.length-i-1];
  //   }
  //   return sum;
  // }
  // public static void main(String ars[]) {
  //   int matrix[][] = {
  //       {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
  //   // spiralMatrix(matrix);
  //   System.out.print(DiagonalSum(matrix));
  // }

  // Search in Sorted Matrix
  public static boolean sortedMatrix(int matrix[][], int key) {
    int row = 0;
    int col = matrix[0].length - 1;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == key) {
        return true;
      } else if (key < matrix[row][col]) {
        col--;
      } else {
        row++;
      }
    }
    System.out.println("Key Not Found");
    return false;
  }

  public static void main(String args[]) {
    int matrix[][] = {
        {10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
    int key = 33;
    sortedMatrix(matrix, key);
  }
}