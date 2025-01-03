// import java.util.*;
// public class Recursion {

/**************** PB: 1 PRINT DECREASING ORDER: ***************/
// public static void printDec(int n){
//     // base class
//     if(n == 1){
//         System.out.println(n);
//         return;
//     }
//     System.out.print(n+" ");
//     // inner function
//     printDec(n-1);
// }

// public static void main(String args[]){
//     int n = 10;
//     printDec(n);

// }
/**************** PB: 2 PRINT INCREASING ORDER: 1, 2, 3, 4, 5 *******/

// public static void printInc(int n){
//     if( n == 1){
//         System.out.print(1 + " ");
//         return;
//     }
//     printInc(n-1);
//     System.out.print(n + " ");
// }
// public static void main(String args[]){
//     int n = 5;
//     printInc(n);
// }

/**************** PB: 3 FACTORIAL OF N **********/

// public static int fact(int n){
//     if( n == 0){
//         return 1;
//     }
//     int fnm1 = fact(n-1);
//     int fn = n * fact(n-1);
//     return fn;
// }

// public static void main(String args[]) {
//     int n = 5;
//     System.out.println( fact(n) );
// }

/**************** PB: 4 SUM OF FIRST N NATURAL NUMBER ***********/

// public static int SumFirstNatural(int n){
//     if (n == 1){
//         return 1;
//     }
//     int Snm1 = SumFirstNatural(n-1);
//     int Sn = n + Snm1;
//     return Sn;
// }

// public static void main(String args[]){
//     int n = 5;
//     System.out.println(SumFirstNatural(n));
// }
// }
  
  /****************PB:5 FIBONACCI NUMBER ***********/
// public static int FibonacciSeries(int n){
//     if(n == 0 || n == 1){
//         return n;
//     }
//     int Fnm1 = FibonacciSeries(n-1);
//     int Fnm2 = FibonacciSeries(n-2);
//     int Fn = Fnm1 + Fnm2;
//     return Fn;
// }

// public static void main(String args[]){
//     int n = 10;
//     System.out.println(FibonacciSeries(n));
// }

/****************PB: 6 CHECK IF ARRAY IS SORTED OR NOT ***********/

// public static boolean isSorted(int arr[], int i){
// i: from where we started to check array is sorted or not
//     base case
//     if(i == arr.length-1) {
//         return true;
//     }

//     if(arr[i] > arr[i+1]){
//         return false;
//     }
//     return isSorted(arr, i+1);
// }

// public static void main(String args[]){
//     int arr[] = {1, 2, 3, 4};
//     System.out.println(isSorted(arr, 0));
// }

/****************PB: 7 FIRST OCCURENCE, IN ARRAY ***********/

// public static int firstOccurence(int arr[], int key, int i){
//     // Base Case
//     if(i == arr.length) {
//         return -1;
//     }

//     if(arr[i] == key){
//         return i;
//     }

//     return firstOccurence(arr, key, i+1);
// }

// public static void main(String args[]){
//     int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//     System.out.println(firstOccurence(arr, 5, 0));
// }

/****************PB: 8 LAST OCCURENCE, IN ARRAY ***********/

//  public static int lastOccurence(int arr[], int key, int i){
//     // base case
//     if(i == arr.length){
//         return -1;
//     }

//     int isFound = lastOccurence(arr, key, i+1);
//     if(isFound == -1 && arr[i] == key){
//         return i;
//     }
//     return isFound;
// }

// public static void main(String args[]){
//     int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//     System.out.println(lastOccurence(arr, 5, 0));
// }

/****************PB: 9 (Brute) Power of X^n ***********/
// public static int PowerXN(int x, int n){
//     // Base case
//     if(n == 0){
//         return 1;
//     }
//     int xnm1 = PowerXN(x, n-1);
//     int xn = x * xnm1;
//     return xn;

//     // execution in one line:
//     // return x * PowerXN(x, n-1);
// }

// public static void main(String args[]){
//     System.out.println(PowerXN(2, 10));
//  }

/****************PB: 10 (Optimize) Power of X^n ***********/
// public static int optimizedPower(int a, int n) {
//   if (n == 0) {
//     return 1;
//   }

//   int halfPower = optimizedPower(a, n / 2);
//   int halfPowerSq = halfPower * halfPower;

//   // n is odd
//   if (n % 2 != 0) {
//     halfPowerSq = a * halfPowerSq;
//   }
//   return halfPowerSq;
// }

// public static void main(String args[]) {
//   int a = 2;
//   int n = 10;
//   System.out.println(optimizedPower(a, n));
// }

  /************** PB:11 Tilling Probblem  **************/

  // public static int tillingProblem(int n){    // 2 X n (floor size) length =
  // n and breadth = 2.
  //     // base case
  //     if(n == 0 || n == 1){
  //         return 1;
  //     }

  //     // work
  //     // vertical choice
  //     int verticalTiles = tillingProblem(n-1);    //f(n-1)

  //     //Horizontal ways
  //     int horizontalTiles = tillingProblem(n-2);  //f(n-2)

  //     int totalWays = verticalTiles + horizontalTiles;
  //     return totalWays;

  // }

  // public static void main(String args[]){
  //     System.out.println(tillingProblem(3));
  // }

  /************** PB:12 Remove Duplicates in a String **************/
  // "a to z" only

  // public static void removeDuplicates(String str, int idx, StringBuilder
  // newStr, boolean map[]){
  //     //base case
  //     if(idx == str.length()){
  //         System.out.println(newStr);
  //         return;
  //     }
  //     //work
  //     char currChar = str.charAt(idx);
  //     if(map[currChar-'a'] == true) {
  //         removeDuplicates(str, idx+1, newStr, map);
  //     } else{
  //         map[currChar-'a'] = true;
  //         removeDuplicates(str, idx+1, newStr.append(currChar), map);
  //     }
  // }
  //     public static void main(String args[]){
  //         String str = "appnnacollege";
  //         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
  //     }

  /************** PB:13 Friends Pairing Problem **************/

  // public static int pairProblem(int n){
  // Base Case
  // if(n == 1 || n == 2){
  //     return n;
  // }

  // work

  // single
  //  int Fnm1 = pairProblem(n-1);

  // //pair
  // int Fnm2 = pairProblem(n-2);
  // int pairWays = (n-1)*Fnm2;

  // totalways
  // int totalWays = Fnm1 + pairWays;
  // return totalWays;

  // return pairProblem(n-1) + (n-1) * pairProblem(n-2);
  // }

  // public static void main(String args[]){
  //     System.out.println(pairProblem(3));
  // }

  /************** PB:14 Binary Strings Problem **************/

  public static void printBinStrings(int n, int lastPlace, String str) {
    // base case
    if (n == 0) {
      System.out.println(str);
      return;
    }

    // work
    printBinStrings(n - 1, 0, str + "0");
    if (lastPlace == 0) {
      printBinStrings(n - 1, 1, str + "1");
    }
  }
  public static void main(String args[]) { printBinStrings(3, 0, ""); }

}
