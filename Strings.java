import java.util.*;
public class Strings {

  // public static void main(String args[]) {
  //   // string creation
  //   String str = "abcd";
  //   String str2 = new String("xyz@123");

  //   // input / output
  //   //  Scanner sc = new Scanner(System.in);
  //   //  String name = sc.next();    // particular word
  //   //  String name = sc.nextLine();  // complete sentence
  //   //  System.out.println(name);

  //   // length
  //   /* String fullName = "Devangini Singh";
  //   System.out.println(fullName.length()); */

  //   // concatenation
  //   String first_name = "Devangini";
  //   String second_name = "Singh";
  //   String fullName = first_name + " " + second_name;
  //   printLetters(fullName);
  //   // System.out.println(fullName);
  //   //charAt: This method, symbolise that character at which index.
  // }

  // public static void printLetters(String str) {
  //   for (int i = 0; i < str.length(); i++) {
  //     System.out.print(str.charAt(i) + " ");
  //   }
  //   System.out.println();
  // }

  // Ques: Check if a string is a PALINDROME.
  /*
  public static boolean IsPalindrome(String str){
    for(int i=0; i<=str.length()/2; i++){
      int n = str.length();
      if(str.charAt(i) != str.charAt(n-1-i)){
        // not a palindrome
        return false;
      }
    }
    return true;
  } */

  // Ques: Shortest Path: Direction
  /*
   public static float shortestPath(String str2){
       int x = 0, y = 0;
       for(int i=0; i<str2.length(); i++){
         char dir = str2.charAt(i);

         //south
         if(dir == 'S'){
           y--;
         } else if(dir == 'N'){
           y++;
         } else if(dir == 'W'){
           x++;
         } else{
           x--;
         }
       }

       int X2 = x*x;
       int Y2 = y*y;
       return (float)Math.sqrt(X2 + Y2);
   }

   public static void main (String args[]){
     // String str = "racecar";
     // System.out.println(IsPalindrome(str));
     String str2 = "WNEENESENNN";
     System.out.println(shortestPath(str2));
   }
   */

  // String compare: .equals(), Interning Concept
  /* public static void main(String args[]){
   String s1 = "Tony";
   String s2 = "Tony";
   String s3 = new String("Tony");

   if(s1.equals(s3)){
     System.out.println("String are equal");
   } else{
     System.out.println("String are Not equal");
   }
  } */

  // Substring
  /*public static String substring(String str, int si, int ei){
    String substr = "";
    for(int i=si; i<ei; i++){
      substr = substr + str.charAt(i);
    }
    return substr;
  }
  public static void main(String args[]){
    String str = "Hello World";
    System.out.println(substring(str, 0, 5));
  }
  */

  // Print Largest String: Orange and Smallest: Apple
  /* public static void main(String args[]){
    String fruits[] = {"apple", "mango", "orange"};
      String largest = fruits[0];
      for(int i=1; i<fruits.length; i++){
        if(largest.compareTo(fruits[i]) < 0){
          largest = fruits[i];
        }
      }
      System.out.println(largest);
  } */

  // String builder and .append()
  /* public static void main(String args[]){
   StringBuilder sb = new StringBuilder(""); // intialise with empty
   for(char ch = 'a'; ch <= 'z'; ch++){
     sb.append(ch);
   }
   System.out.println(sb);
  } */

  // Convert first letter of string in upperCase.
  /* public static String upperCase(String str){
    StringBuilder sb = new StringBuilder("");

    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1; i<str.length(); i++){
      if(str.charAt(i) == ' ' && i < str.length() - 1){
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      } else{
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
   }
   public static void main(String args[]){
    String str = "hi, i am devangini";
    System.out.println(upperCase(str));
   } */

  // String Compression
  public static String compressString(String str) {
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
      Integer count = 1;
      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }
      newStr += str.charAt(i);
      if (count > 1) {
        newStr += count.toString();
      }
    }
    return newStr;
  }
  public static void main(String args[]) {
    String str = "aaabbccdd";
    System.out.println(compressString(str));
  }
}