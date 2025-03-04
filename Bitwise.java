import java.util.*;
public class Bitwise {
  /*
  public static void main(String args[]) {
    // Basics of Bitwise Operator

    System.out.println(5&6);   // Bitwise AND
    System.out.println(5|6);   // Bitwise OR
    System.out.println(5^6);   // Bitwise XOR
    System.out.println(~5);   // Bitwise One's Complement or NOT Operator
    System.out.println(5<<2);   // Bitwise LEF Shift
    System.out.println(6>>1);   // Bitwise RIGHT Shift

  }
  */

  // Check if Odd or Even
  /*
  public static void oddEven(int n) {
    int bitmask = 1;
    if ((n & bitmask) == 0) {
      System.out.println("Number is Even");
    } else {
      System.out.println("Number is Odd");
    }
  }
  public static void main(String args[]) {
    oddEven(3);
    oddEven(4);
  } */

  // Get ith bit: ith bit: 0 or 1
  /* public static int IthBit(int n, int i){
     int bitmask = 1 << i;
     if((n & bitmask) == 0){
         return 0;
     } else {
         return 1;
     }
  }
  public static void main(String args[]){
     System.out.println(IthBit(10, 2));
  }
 */

  // Set ith bit: Convert into 1
  /*public static int setIthBit(int n, int i){
      int bitmask = 1 << i;
      return n | bitmask;
  }
  public static void main(String args[]){
      System.out.println(setIthBit(10, 2));
  }
  */

  // Cleath ith bit:  Convert into 0.
  /* public static int clearIthBit(int n, int i){
      int bitmask = ~(1 << i);
      return n & bitmask;
  }
  public static void main(String args[]){
      System.out.println(clearIthBit(10, 1));
  }  */

  // Update Ith Bit: 2 approach
  /* public static int updateIthBit(int n, int i, int newBit) {
  // first approach
    // if(newBit == 0){
    //     return clearIthBit(n, i);
    // } else {
    //     return setIthBit(n, i);
    // }

    // second approach
    n = clearIthBit(n, i);
    int bitmask = newBit << i;
    return n | bitmask;
  }

  public static void main(String args[]) {
    System.out.println(updateIthBit(10, 2, 1));
  } */

  // Clear Last Ith Bit
  /* public static int clearLastIthBit(int n, int i){
     int bitmask = ((-1)<<i);
     return n & bitmask;
  }
  public static void main (String args[]){
     System.out.println(clearLastIthBit(15, 2));
  } */

  // Clear Range of Bits
  /* public static int ClearRangeBits(int n, int i, int j){
      int a = ((~0)<<(j+1));
      int b = (1<<i)-1;
      int bitMask = a | b;
      return n & bitMask;
  }

  public static void main(String args[]){
      System.out.println(ClearRangeBits(10, 2, 4));
  } */

  // Check if a number is a power of 2 or not.
  /* public static boolean PowerofTwo(int n){
     return (n&(n-1)) == 0;
  }
    public static void main(String args[]){
       System.out.println(PowerofTwo(12));
   } */

  // Count Set Bits in a Number
   public static int countsetBit(int n){
     int count = 0;
     while(n > 0){
         if((n & 1) != 0){    // check LSB
             count++;
         }
         n = n>>1;
     }
     return count;
 }
 public static void main(String args[]){
     System.out.println(countsetBit(16));
 } 

  // Fast Exponentiation
  public static int FastExponentiation(int a, int n) {
    int ans = 1;
    while (n > 0) {
      if ((n & 1) != 0) { // check LSB
        ans = ans * a;
      }
      a = a * a;
      n = n >> 1;
    }
    return ans;
  }
  public static void main(String args[]) {
    System.out.println(FastExponentiation(3, 5));
  }
}
