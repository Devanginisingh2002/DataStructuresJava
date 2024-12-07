import java.util.*;
public class file {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // Print "Hello World"  100 times?
    /*
    int counter = 0;
    while(counter < 100){
        System.out.println(counter + "Hello World");
        counter++;
    }

    // Print number from 1 to 10 (while loop)
    int i = 1;
    while(i <= 10){
        System.out.println(i);
        i++;
    }

   // for loop
   for(int i=1; i<=10; i++){
    System.out.println(i);
   }

// Print number from 1 to n? (As user input)
   int counter = 1;
   System.out.print("Input number for range: ");
   int i = sc.nextInt();
   while(counter <= i){
    System.out.println("Num: " + counter);
    counter++;
   }


   // Print sum of first 'n' natural number.
   int n = sc.nextInt();
   int counter = 1;
   int sum = 0;
   while(counter <= n){
    sum = sum + counter;
    counter++;
        }
    System.out.println(sum);



   // Print square pattern using for loop.
   for(int i=1; i<=4; i++){
    System.out.println("* * * *");
   }

   // print reverse of the number: n = 10889
   int n = 10889;
   while(n > 0){
    int lastDigit = n % 10;
    System.out.print(lastDigit);
    n = n / 10;
   }
   System.out.println();



// 2nd Method:
int n = 10889;
int reverse = 0;
while ( n > 0){
    int lastDigit = n % 10;
    reverse = (reverse * 10) + lastDigit;
    n = n / 10;
}
System.out.print(reverse);

// Keep Entering numbers till user enters a multiple of 10. (do-while and break
Keyword) do{ System.out.print("Enter your number: "); int n = sc.nextInt(); if
(n%10 == 0){ break;
    }
    System.out.println(n);
} while(true);

// Display all numbers entered by user except multiples of 10.
do {
System.out.print("Enter your number: ");
int n = sc.nextInt();
if (n % 10 == 0){
    continue;
}
System.out.println("number was: "+ n);
} while(true);

// Check if the number is prime or not?
System.out.print("Input a num: ");
int n = sc.nextInt();
boolean isPrime = true;  //assume my number is Prime
if( n == 2){
    System.out.println("n is Prime");
}  else{
    for(int i=2; i<=Math.sqrt(n); i++){
        if(n % i == 0){   // number is a composite
            isPrime = false;
        }
    }
        if(isPrime == true){
            System.out.println("n is prime");
        }else{
            System.out.println("n is a composite");
        }
    }

    //  Write a program that reads a set of integers,and then prints the sum of
the even and odd integers. int number; int choice; int evenSum = 0; int oddSum =
0; do { System.out.print("Enter the number "); number = sc.nextInt(); if (number
% 2 == 0) {  ̰ evenSum += number; } else { oddSum += number;
      }
      System.out.println(
          "Do you want to continue, Press 1: and 2 for quit the game");
      choice = sc.nextInt();
    } while (choice == 1);
    System.out.println("Sum of even numbers: " + evenSum);
    System.out.println("Sum of odd numbers: " + oddSum);
    // Write a program to find the factorial of any number entered by the user.
    System.out.print("Input factorial num: ");
    int num = sc.nextInt();
    int f = 1;
    for(int i=1; i <=num; i++){
        f = f * i;
    }
    System.out.print(f);

    Write a program to print the multiplication table of an number N, entered by the user.
*/
    System.out.print("Enter a table: ");
    int n = sc.nextInt();
    for(int i=1; i<=10; i++){
        System.out.println(n + " * " + i + " = "+ n*i);
    }
  }
}
