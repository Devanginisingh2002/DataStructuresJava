public class Abstraction7 {

  public static void main(String args[]) {
    // Horse H = new Horse();
    // H.eat();
    // H.walk();
    // System.out.println(H.color);

    // Chicken C = new Chicken();
    // C.eat();
    // C.walk();

    MustangBreedHorse myHorse = new MustangBreedHorse();
    // Animal constr called --> horse --> MustangBreedHorse
  }
}

abstract class Animal {

  // Constructor
  // String color;
  // Animal() {
  //     color = "brown";
  // }

  // constructor
  Animal() { System.out.println("Animal Constructor called"); }

  // non abstract func
  void eat() { System.out.println("Animal Eats"); }

  // Abstract func
  abstract void walk();
}

class Horse extends Animal {
  Horse() { System.out.println("Horse const called"); }

  // void changeColor() {
  //     color = "Dark Brown";
  // }
  void walk() { System.out.println("Walks on 4 legs"); }
}

class MustangBreedHorse extends Horse {
  MustangBreedHorse() {
    System.out.println("Mustang breed of horse const called");
  }
}

class Chicken extends Animal {
  // void changeColor() {
  //     color = "Light Yellow";
  // }
  void walk() { System.out.println("Walks on 2 legs"); }
}