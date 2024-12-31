/*  Que:1 Find out the correct statement to assign name to object?
a. S->name = "aman";
b. Student.name = "aman";
c. S.name = "aman". --> answer
d. none of these
*/
/*
class Student {
    String name;
    int marks;
}

public class OOPS {
    public static void main(String args[]){
        Student S = new Student();
        // fill here
    }
}
*/

/* Que:2 Which Variable(s) can the class Person access in the code ?
a. name. --> answer
b. weight --> answer
c. roll_number
d. SchoolName
*/
/*
class Person {
  String name;
  int weight;
}
class Student extends Person {
  int roll_number;
  String SchoolName;
}
*/

/* Que:3 Which of the following modifiers are not allowed in front of class 
a. private --> answer
b. protected --> answer
c. public
d. default
*/

/* Que:4 Which of the following is correct statement ?(Both Classes in the Same Packages) 
a. Car c = new Car();  --> answer
b. Vehicle V = new Vehicle();  --> answer
c. Vehicle V = new Car();  --> answer
d. Car c = new Vehicle();
*/

/*
class Vehicle { }
class Car extends Vehicle{ } 
*/

/* Que:5 What is the Output of the Code? 
Output: Derived Class (Car)
        Base Class (Vehicle)
*/

/* 
import java.util.*;
public class inheritance {
  public static void main(String[] args) {
    Vehicle obj1 = new Car();
    obj1.print();

    Vehicle obj2 = new Vehicle();
    obj2.print();
  }
}

class Vehicle {
  void print() { System.out.println("Base Class (Vehicle)"); }
}

class Car extends Vehicle {
  void print() { System.out.println("Derived Class (Car)"); }
}
*/

/* Que:6 Output of the Code 
Output: Error
*/

/*
public class inheritance {
  public static void main(String[] args) {
    Vehicle obj1 = new Car();
    obj1.print1();

    Vehicle obj2 = new Vehicle();
    obj2.print();
  }
}

class Vehicle {
  void print() { System.out.println("Base Class (Vehicle)"); }
}

class Car extends Vehicle {
  void print1() { System.out.println("Derived Class (Car)"); }
}
*/

/* Que:7 Which is not an OOPS concept ?
a. Inheritance
b. Encapsulation
c. Polymorphism
d. Aggregation --> answer
*/

/* Que:8 Output of the code ?
Output: 0, 2
 */
/*
class Book {
  int price;
  static int count;
  public Book(int price) {
    this.price = price;
    count++;
  }
}
public class OOPS {
  public static void main(String[] args) {
    System.out.println(Book.count);
    Book b1 = new Book(150);
    Book b2 = new Book(250);
    System.out.println(Book.count);
  }
}
 */

/* Que:9 Which line has Error ? answer --> NO ERROR
*/
/*
class Test {
  static int marks;
  void set_marks(int marks) {
    this.marks = marks; // line1
  }
}

public class OOPS {
  public static void main(String[] args) {
    Test t = new Test();
    t.set_marks(98);                // line2
    System.out.println(Test.marks); // line3
  }
}
*/

/* Que:10 Output of the Code ?
    Output: 40
*/
/*
class Test {
  Static int a = 10;
  Static int b;
  Static void changeB() { b = a * 3; }
}

class OOPS {
  public static void main(String args[]) {
    Test t = new Test();
    t.changeB();
    System.out.println(Test.a + Test.b);
  }
}
*/