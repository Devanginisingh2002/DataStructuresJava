import java.util.*;

public class GetterSetter {
  public static void main(String args[]) {
    Pen p1 = new Pen();
    p1.setColor("Blue");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());

    // we can change the color
     p1.setColor("Yellow");
    System.out.println(p1.getColor()); 
  }
}

class Pen {
  private String color;
  private int tip;

    //getter 
    String getColor() {
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    //setter
    void setColor(String newColor) { 
        this.color = newColor; 
    }
    void setTip(int tip) {
        this.tip = tip; 
    }
}