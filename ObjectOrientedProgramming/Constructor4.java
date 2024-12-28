// public class Constructor4 {
//     public static void main(String args[]){
//         Student s1 = new Student();
//         Student s2 = new Student("Riya");
//         Student s3 = new Student(123);
//         // Student s4 = new Student("Aman", 789);  -> output: Error because
//         this type of constructor doesnot exist.
//     }
// }

// class Student{
//     String name;
//     int roll;

//     // Non-parameterized constructor
//     // Student(){
//     //     System.out.println("Constructor is called");
//     // }

//     // Paramterized
//     // Student(String name){
//     //     this.name = name;
//     // }

//     Student(int roll){
//         this.roll = roll;
//     }
// }

/********* COPY CONSTRUCTOR ***********/

public class const2 {
  public static void main(String args[]) {
    Student s1 = new Student();
    s1.name = "Riya";
    s1.roll = 456;
    s1.password = "abcd";
    s1.marks[0] = 100;
    s1.marks[1] = 90;
    s1.marks[2] = 80;

    // student s2 Object: which copy all the properties of s1.
    Student s2 = new Student(s1);
    // In case, s2 forgot their password.
    s2.password = "xyz";

    // changing the marks
    s1.marks[2] = 100;
    for (int i = 0; i < 3; i++) {
      System.out.println(s2.marks[i]);
    }
  }
}

class Student {
  String name;
  int roll;
  String password;
  int marks[];

  // copy constructor: s2 copy all the properties of s1
  // Also, Shallow copy constructor
  // Student(Student s1){
  //     marks = new int[3];
  //     this.name = s1.name;
  //     this.roll = s1.roll;
  //     this.marks = s1.marks;
  // }

  // Deep copy constructor
  Student(Student s1) {
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    for (int i = 0; i < marks.length; i++) {
      this.marks[i] = s1.marks[i];
    }
  }

  Student() {
    marks = new int[3];
    System.out.println("Constr is called");
  }

  Student(String name) { marks = new int[3]; }
}