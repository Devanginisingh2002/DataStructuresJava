public class Polymorphism6 {
  public static void main(String args[]) {

    // Calculator calc = new Calculator();
    // System.out.println(calc.sum(1, 2));
    // System.out.println(calc.sum((float)1.5, (float)2.5));
    // System.out.println(calc.sum(1, 2, 3));

    Deer D = new Deer();
    D.eat();
  }
}

/*************** METHOD OVERLOADING ***************/

// class Calculator{
//     int sum(int a, int b){
//         return a+b;
//     }

//     float sum(float a, float b){
//         return a+b;
//     }

//     int sum(int a, int b, int c){
//         return a + b + c;
//     }
// }

/*************** METHOD OVERRIDING ***************/

class Animal {
  void eat() { System.out.println("Eats Anything"); }
}

class Deer extends Animal {
  void eat() { System.out.println("Eats Grass"); }
}