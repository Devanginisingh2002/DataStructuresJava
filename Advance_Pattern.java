import java.util.*;
public class file {

  // public static void hollowRectangle(int totalRows, int totalCols){
  //   for(int i=1; i<=totalRows; i++){
  //     for(int j=1; j<=totalCols; j++){
  //       if(i == 1 || i == totalRows || j == 1 || j == totalCols){
  //         System.out.print("*");
  //       } else{
  //         System.out.print(" ");
  //       }
  //     }
  //     System.out.println();
  //   }
  // }

  // public static void invertedRotatedHalfPyramid(){
  //   for (int i=1; i<=4; i++){
  //     for(int j=1; j<=(4-i); j++){
  //       System.out.print(" ");
  //     }
  //     for(int j=1; j<=i; j++){
  //       System.out.print("*");
  //     }
  //     System.out.println();
  //   }
  // }

  // public static void invertedHalfPyramid(){
  //   for(int i=1; i<=5; i++){
  //     for(int j=1; j<=5-i+1; j++){
  //       System.out.print(j);
  //     }
  //     System.out.println();
  //   }
  // }

  // public static void FloydTriangle(){
  //   int counter = 1;
  //   for(int i=1; i<=5; i++){
  //     for(int j=1; j<=i; j++){
  //       System.out.print(" " + counter);
  //       counter++;
  //     }
  //     System.out.println();
  //   }
  // }

  // public static void FloydTriangle(){
  //   for(int i=1; i<=5; i++){
  //     for(int j=1; j<=i; j++){
  //       if((i+j) % 2 == 0){
  //         System.out.print("1");
  //       } else {
  //         System.out.print("0");
  //       }
  //     }
  //     System.out.println();
  //   }
  // }

  // Butterfly Pattern
  //  public static void ButterFlyPattern(int n){
  //    // 1st half
  //    for(int i=1; i<=n; i++){
  //      // stars
  //      for(int j=1; j<=i; j++){
  //        System.out.print("*");
  //      }
  //      //spaces (2(n-i))
  //      for(int j=1; j<=2*(n-i); j++){
  //        System.out.print(" ");
  //      }
  //      //stars
  //      for(int j=1; j<=i; j++){
  //        System.out.print("*");
  //      }
  //      System.out.println();
  //    }

  //   //2nd half(inverted)
  //   for(int i=n; i>=1; i--){
  //    // stars
  //     for(int j=1; j<=i; j++){
  //       System.out.print("*");
  //     }
  //     //spaces (2(n-i))
  //     for(int j=1; j<=2*(n-i); j++){
  //       System.out.print(" ");
  //     }
  //     //stars
  //     for(int j=1; j<=i; j++){
  //       System.out.print("*");
  //     }
  //     System.out.println();
  //   }
  // }

  // Solid Rhombus
  //  public static void SolidRhombus(int n){
  //    for(int i=1; i<=n; i++){
  //      //spaces
  //        for(int j=1; j<=(n-i); j++){
  //          System.out.print(" ");
  //        }
  //      //stars
  //        for(int j=1; j<=n; j++){
  //          System.out.print("*");
  //        }
  //      System.out.println();
  //    }
  //  }

  // Hollow Rhombus
  // public static void HollowRhombus(int n){
  //     for(int i = 1; i<=n; i++){
  //       //spaces
  //       for(int j=1; j<=n-i; j++){
  //         System.out.print(" ");
  //       }
  //       //stars
  //       for(int j=1; j<=n; j++){
  //         if(i == 1 || i == n || j == 1 || j == n){
  //           System.out.print("*");
  //         } else {
  //           System.out.print(" ");
  //         }
  //       }
  //       System.out.println();
  //     }
  // }

  public static void DiamondPattern(int n) {
    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      // stars
      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = n; i >= 1; i--) {
      // spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      // stars
      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String args[]) {
    // hollowRectangle(10, 15);
    // invertedRotatedHalfPyramid();
    // invertedHalfPyramid();
    // FloydTriangle();
    // ButterFlyPattern(5);
    // SolidRhombus(4);
    // HollowRhombus(5);
    DiamondPattern(5);
  }
}