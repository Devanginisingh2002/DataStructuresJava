import java.util.*;
    public class function{
        /* Hello World 
        public static void printHelloWorld(){
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");
        }

        public static void main(String agrs[]){
            printHelloWorld(); //function call
        } */


        /*  Sum of A & B (User Input) 
        public static int calculatesum(int num1, int num2){     // parameters or formal parameters
            int sum = num1 + num2;
            return sum;
        } 

        public static void main(String agrs[]){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = calculatesum(a, b);   // Arguments or actual parameters
            System.out.println("Sum is: "+ sum);
        } */


        // Swap of A & B. - Values exhange
        /* public static void swap(int a, int b){
            int temp = a;
            a = b;
            b = temp;
            System.out.println("a =" + a);
            System.out.println("b =" + b); 
        }

        public static void main(String agrs[]){
        int a = 5;
        int b = 10;
        swap(a,b);
        } */

        /*  Product of A & B.
        public static int productAB(int A, int B){
            int product = A*B;
            return product;
        }
        public static void main(String args[]){
            int A = 3;
            int B = 5;
            int product = productAB(A, B);
            System.out.println("Product: "+ product);
            product = productAB(10, 20);
            System.out.println("Product: "+ product);
        } */

        // Factorial of n

        /*  public static int factorial(int n){
            int f = 1;
            for(int i = 1; i<=n; i++){
                f = f*i;
            }
            return f;
        } */
        /*
        public static void main(String args[]){
        System.out.println(factorial(8));
        } */


        // Binomial Coefficient

       /*  public static int BinoCoeff(int n, int r){
            int fact_n = factorial(n);
            int fact_r = factorial(r);
            int fact_nmr = factorial(n-r);

            int BinoCoeff = fact_n/(fact_r*fact_nmr);
            return BinoCoeff;
        }
        public static void main(String args[]){
            System.out.println(BinoCoeff(5,2));
        } */

        // Function Overloading: Using parameters
        /* public static int sum(int a, int b){    //func to calculate sum of 2 numbers.
            return a+b;
        }
        public static int sum(int a, int b, int c){     //func to calculate sum of 3 numbers.
            return a+b+c;
        }

        public static void main(String args[]){
            System.out.println(sum(2,3));
            System.out.println(sum(2,3,5));
        } */

        // Function overloading: Using DataTypes
       /*  public static int sum(int a, int b){
            return a+b;
        }
        public static float sum(float a, float b){
            return a+b;
        }
        public static void main(String args[]){
            System.out.println(sum(2,3));
            System.out.println(sum(2.8f,3.2f));
        }
 */

        // Check if the number is prime or not

        // public static boolean isPrime(int n){
        //     // boolean isPrime = true;
        //     for(int i=2; i<=n-1; i++){
        //         if(n % i == 0){   //completely dividing
        //             /* isPrime=false;
        //             break; */
        //             return false;
        //         }
        //     }
        // return true;
        // }
        /* public static void main(String args[]){
            System.out.println(isPrime(3));
        } */


        // Check Prime number: Optimized approach
       /*  public static boolean PrimeN(int n){
        //Special case or Corner case
        if(n == 2){
            return true;
        }

            for(int i = 2; i<=Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }

        public static void main (String args[]){
            System.out.println(PrimeN(9));
        } */


        // Print prime numbers: 2 to 20
        /* public static void primesInRange(int n){
            for(int i=2; i<=n; i++){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        public static void main(String args[]){
            primesInRange(20);
        } */

        //Code: Binary to Decimal 
        /*  public static void binToDec(int binNum){
            int myNum = binNum;
            int pow = 0;
            int decNum = 0;

            while(binNum > 0){
                int lastDigit = binNum % 10; //Remove last digit concept
                                            // Use Type casting
                decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
                pow++;
                binNum = binNum/10;
            }

            System.out.println(" Decimal of " + myNum + " = "+ decNum);
        }

        public static void main(String args[]){
            binToDec(101);
        } */

        // Code: Decimal to Binary
        /* public static void decToBin(int n){
            int myNum = n;
            int pow = 0;
            int binNum = 0;

            while(n>0){
                int rem = n % 2;
                binNum = binNum + (rem * (int)Math.pow(10, pow));
                pow++;
                n = n / 2;
            }

            System.out.println("Binary form of " + myNum + " = " + binNum);
        }
        public static void main(String args[]){
            decToBin(7);
        } */

}