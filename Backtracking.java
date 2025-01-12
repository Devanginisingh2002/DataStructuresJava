import java.util.*;
public class Backtracking {
    /************* Backtracking on Arrays ***************/
    // public static void changeArr(int arr[], int i, int val){
    //     //base case
    //     if(i == arr.length){
    //         printArr(arr);
    //         return;
    //     }
    //     //recursion
    //     arr[i] = val;    // assign value
    //     changeArr(arr, i+1, val+1);  // function call
    //     arr[i] = arr[i] - 2;     // backtracking step
    // }

    // public static void printArr(int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }

    // public static void main(String args[]){
    //     int arr[] = new int[5];
    //     changeArr(arr, 0, 1);
    //     printArr(arr);
    // }

    /************ Find Subsets ***********/
    // public static void findSubsets(String str, String ans, int i){
    // str: existing string, ans: taking new string for subsets store, and i: index of the string
    //     // base case
    //     if(i == str.length()) {
    //         System.out.println(ans);
    //         return;
    //     }
    //Two choices: Yes and No
    //     // Yes Choice
    //     findSubsets(str, ans+str.charAt(i), i+1);    
    //     // No Choice
    //     findSubsets(str, ans, i+1);
    // }

    // public static void main(String args[]){
    //     String str = "abc";
    //     findSubsets(str, "", 0);
    // }

    public static void findPermutation(String str, String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            // "abcde" => "ab" + "de" = "abde"
            str = str.substring(0, i) + str.substring(i+1);
            findPermutation(str, ans+curr);
        }
    }

    public static void main(String args[]){
        String str = "abc";
        findPermutation(str, "");
    }
}