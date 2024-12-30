import java.util.*;
public class SuperKeyword10 {
  public static void main(String args[]) {
    Horse H = new Horse();
    System.out.println(H.color);
  }
}

class Animal {
  String color;
  Animal() { System.out.println("Animal Constructor is called"); }
}

class Horse extends Animal {
  Horse() {
    super.color = "Brown";
    // super();
    System.out.println("Horse constructor is called");
  }
}