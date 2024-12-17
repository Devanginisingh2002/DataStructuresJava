// import java.util.*;
// public class ArraysCC{
//      public static void main(String args[]){

//         // creation of an array

//         /* int marks[] = new int[50];
//         int numbers[] = {1, 2, 3};
//         String fruits[] = {"mango", "apple", "orange"}; */



//         //Input / Output
        
//         /* int marks[] = new int[100];
//         Scanner sc = new Scanner(System.in); */


//         // Array Index 
//         // int phy;
//         // phy = sc.nextInt();

//         // marks[0] = sc.nextInt();    //phys
//         // marks[1] = sc.nextInt();    //chem
//         // marks[2] = sc.nextInt();    //maths

//         // System.out.println("Phys: "+ marks[0]);
//         // System.out.println("Chems: "+ marks[1]);
//         // System.out.println("Maths: "+ marks[2]);

//         //Update
//         // marks[2] = 100;
//         /* marks[2] = marks[2] + 1;
//         System.out.println("Maths: "+ marks[2]); */

//         // Percentage
//         // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//         // System.out.println("Percentage = " + percentage + "%");

//         //lenght of an array
//         // System.out.println("Length of an array: "+ marks.length);


//     }
// }


// second file:
import java.util.*;
public class file{


/******************** ARGUMENTS IN JAVA  *****************************/

    /* public static void update(int marks[], int nonChangeable){
        nonChangeable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1; 
        }
    }

    public static void main(String args[]){
        int marks[] = {97, 98, 99};
        int nonChangeable = 5;
        update(marks, nonChangeable);
        System.out.println(nonChangeable);

        //printing our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    } */




/******************** LINEAR SEARCH *****************************/

/*     public static int linear_Search(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 20;

        int index = linear_Search(number, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("KEY is FOUND: "+ index);
        }

    } */


    /* MENU PROBLEM: In form of strings

    public static int linear_Search(int menu[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){   // (menuCard[i].equals(key))(in string we use .equals method)
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String menu[] = {"Dosa", "Fish", "Chips"};
        // int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = Fish;

        String index = linear_Search(menu, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("KEY is FOUND: "+ index);
        } 
    }*/





//****************************** LARGEST NUMBER**********************/

/* public static int getLargest(int numbers[]){
    
    int largest = Integer.MIN_VALUE; // -infinity: 
    int smallest = Integer.MAX_VALUE; //+infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is: "+ smallest);
        return largest;
    }

    public static void main(String args[]){
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("Largest Value is: "+ getLargest(numbers));
    } */


/**************************** BINARY SEARCH  *********************************/

    /* public static int Binary_search(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;
        while(start <= end){
            int mid = (start + end ) / 2;

            //compariosons

            if(numbers[mid] == key){        // found
                return mid;
            }
            if(numbers[mid] < key){         // right: second half
                start = mid + 1;
            }else{
                //left: first half
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println("Index for key is: " + Binary_search(numbers, key));
    } */




/**************************** REVERSE AN ARRAY  *********************************/

/* public static void Reverse_Array(int numbers[]){
    
    int first = 0, last = numbers.length-1;
    while(first < last){
        //swap 
        int temp = numbers[last];
        numbers[last] = numbers[first];
        numbers[first] = temp; 

        first++;
        last--;
    }
}

public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10};
    
    //function call
    Reverse_Array(numbers);

    //print array
    for(int i=0; i<numbers.length; i++){
        System.out.print(numbers[i]+ " ");
    }
    System.out.println();
} */




/**************************** PAIRS IN AN ARRAY  *********************************/


/* public static void Pairs_Array(int numbers[]){
    int total_pairs = 0;    // calculating the total pairs
    for(int i=0; i < numbers.length; i++){
        int current = numbers[i];   // 2, 4, 6, 8, 10
        for(int j=i+1; j < numbers.length; j++){

            //printing the pairs
            System.out.print("(" + current + "," + numbers[j] + ")");
            total_pairs++;
        }
        System.out.println();
    }
    //printing the total pairs
    System.out.println("Total pairs: " + total_pairs);
}

public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10};
    Pairs_Array(numbers);

} */



/**************************** PRINT SUBARRAY  *********************************/

/* public static void Print_Subarrays(int numbers[]){
    int total_subarrays = 0;
    for(int i=0; i < numbers.length; i++){
        int start = i;
        for(int j=i; j < numbers.length; j++){
            int end = j;
            for(int k=start; k <= end; k++){
                System.out.print(numbers[k]+" ");   //printing subarray
            }
            total_subarrays++;
            System.out.println();
        }
        System.out.println();
    }
        System.out.println("Total pairs of Subarrays: "+ total_subarrays);
}
public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10};
    Print_Subarrays(numbers);
} */

} 


// third file:

import java.util.*;
public class max_subarray{

/**************************** MAX SUBARRAY SUM  ****************************/


// First Approach: Brute Force

/* public static void MAX_Subarray_Sum(int numbers[]){

    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;     //comparisons

    for(int i=0; i < numbers.length; i++){
        int start = i;
        for(int j=0; j < numbers.length; j++){
            
            int end = j;
            currSum= 0;

            for(int k = start; k <= end; k++){
                // subarray sum
                currSum += numbers[k];
            }
            System.out.println(currSum);
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
    }
    System.out.println("MAX Sum: " + maxSum);
}

public static void main(String args[]){
    int numbers[] = {1, -2, 6, -1, 3};
    MAX_Subarray_Sum(numbers);
} */


//********************** Second Approach: Prefix array with formula ******************//

    /* public static void MAX_Subarray_Sum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i < numbers.length; i++){
            int start = i;
            for(int j=0; j < numbers.length; j++){ 
                int end = j;

                // condition like start = 0.
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max subarray Sum: " + maxSum);
    }

    public static void main(String args[]){
        int numbers[] = {1, -2, 6, -1, 3};
        MAX_Subarray_Sum(numbers);
    }  */

    
//**********************  Third Approach: Kadane's Algorithm: Negative value == 0 ***************//

    /* public static void Kadane_Algorithm(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i < numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);  //MATH function
        }
        System.out.println("Max subarray sum: " + ms);
    }

    public static void main(String args[]){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadane_Algorithm(numbers);
    } */

/**************************** Ques: TRAPPING RAINWATER  ****************************/

// Given a non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining. 

/*     public static int trappedRainwater(int height[]){
        int n = height.length;

        //calculate left max boundary: Array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        
        //calculate right max boundary: Array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0; i<n; i++){
            
            //waterLevel: min (left max boundary, right max boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = waterlevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    } 

    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(height));
    }
 */


 // Buy & Sell Stocks

    public static int BuyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i < prices.length; i++){
            if(buyPrice < prices[i]){       //profit
                int profit = prices[i] - buyPrice;  //today's profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(BuyAndSellStocks(prices));
    }
}