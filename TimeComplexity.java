// Time and Space Complexity

/************ TIME COMPLEXITY ***********/
/*
Order Complexity Analysis:
* Amount of Space or time taken up by an algorithm/Code as function of input
size.
* Not the acutal time taken.

* SORTED ARRAY: Perform Constant Operation.
Case 1 -> Array Size (Increase), Time (Increase)
Case 2 -> Array Size (Increase), Time is Constant:  MORE EFFICIENT

* For Time Complexity: If we want to check on any program -> We need to see the
WORST CASE.
* Linear Search = O(n).  Graph: y = ax + b.

* CONSTANT TIME COMPLEXITY: Find largest and smallest array: TC ->>> O(1).

* 1. BIG O Notation: Upper Bound -> Worst Case T.C
 (BIG O: If someone ask what's the t.c of the program, Always we need to tell
the Big O Notation TC (Worst Case). Graph: an^2 + bn + c.


 * 2. BIG OMEGA: Lower Bound T.C
 (BIG Omega: omega(n^2) is Best Case for this).
 (Omeag(n) and Omega(1) is not possible).

 * 3. BIG THETA: Average Bound T.C
 (Like, Upper is Big 0 and lower is Omega: In between: Average: BIG Theta).
 (Theta(n^2): Average T.C).

 NOTE: 1. Small O, Small Omega and Small Theta is not important Time Complexity
for the Placement purpose.
       2. Tightly Time complexity: BIG O. and Loosly Time Complexity: Small 0.
       Example of point 2: Height of the person (If we tell between 6ft to 5ft:
TIGHTLY TIME COMPLEXITY), Height of the person (If we tell between 1inch to
10ft: LOOSLY TIME COMPLEXITY).

*/

/************ SPACE COMPLEXITY **************/
/*
 * The amount of space the program takes.
 * Memory: Heap Stack (Objects), Stack (Functional Call).
 * Input Space + Auxilliary Space
 */

/* Theoretical Analysis:
* Simple Loop:
for(int i=0; i<n; i++){
      // Some Constant Work
     // Is done in this loop.
}
Time Complexity: O(n).

* Nested Loop 1:
for(int i=0; i < n; i++){
      for(int j = i + 1; j < n; j++){
            // constant work
            // Done in this loop
      }
}
Time Complexity: O(n^2)

* Nested Loop 2:
for(int i=0; i<n; i++){
      for(int j=0; j<i; j++){
            //Work Done
      }
}
T.C: O(n^2)

* Nested Loop 3:
Constant 'k' & k<n
for(int i=0; i<n; i=i+k){
      for(int j=i+1; j<=k; j++){
            // Some constant work
      }
}
T.C: O(n)

* SORTING: Bubble Sort (Brute Way)
Worst Case: O(n^2) and Best Case: O(n^2)

 * Bubble Sort (Optimized Way) -> Swapping task
 T.C: Worst Case: O(n^2) and Best Case: O(n).

 * Binary Search Analysis:
 Time Complexity: O(log n)

 * Recursive Complexity Analysis:
 T.C: O(n)

 * Sum of N

*/
