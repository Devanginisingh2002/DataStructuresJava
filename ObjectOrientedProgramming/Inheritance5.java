public class Inheritance5 {
  public static void main(String args[]) {

    // Single level
    // Fish shark = new Fish();
    // shark.eat();

    // Multi level
    // Dogs dobby = new Dogs();
    // dobby.eat();
    // dobby.breathe();
    // dobby.legs = 4;
    // System.out.println(dobby.legs);
  }
}

class Animal {
  String color;

  void eat() { System.out.println("Eat"); }

  void breathe() { System.out.println("Breathes"); }
}

/*************** Single level inheritance ***************/
// class Fish extends Animal{
//     int fins;
//     // create swim functions.
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }

/*************** Multi level inheritance ***************/
// class Mammals extends Animal{
//     int legs;
// }

// class Dogs extends Mammals{
//     String breeds;
// }

/*************** Hierarchial inheritance ***************/
// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swim");
//     }
// }

// class Bird extends Animal{
//     void fly(){
//         System.out.println("Fly");
//     }
// }

// class Mammals extends Animal{
//     void walk(){
//         System.out.println("On Floor");
//     }
// }

/*************** Hybrid inheritance ***************/

class Fish extends Animal {
  String Fins;
  System.out.println(Fins);
}

class Tuna extends Fish {
  // functions
}
class Shark extends Fish {
  // functions
}

class Bird extends Animal {
  int age;
  System.out.println(age);
}

class Peacock extends Bird {
  // functions
}

class Mammals extends Animal {
  String valid_type;
  System.out.println(valid_type);
}

class Dog extends Mammals {
  // functions
}

class cat extends Mammals {
  // functions
}

class Human extends Mammals {
  // functions
}
