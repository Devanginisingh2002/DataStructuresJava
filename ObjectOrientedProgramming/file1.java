import java.util.*;

public class file1 {
  public static void main(String args[]) {
    // created a pen object, p1. (Pen(): It's form of constructor)
    Pen p1 = new Pen();
    p1.setColor("Blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);

    // we can change the color
    /* p1.setColor("Yellow");
    System.out.println(p1.color); */
  }
}

// Basic Class
class Pen {
  // attributes
  String color;
  int tip;

    // functions
    void setColor(String newColor) { 
        color = newColor; 
    }
    void setTip(int newTip) {
        tip = newTip; 
    }
}