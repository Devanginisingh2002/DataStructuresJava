import java.util.*;
public class StaticKeyword9 {
  public static void main(String args[]) {
    Student S1 = new Student();
    S1.schoolName = "JMV";

    Student S2 = new Student();
    System.out.println(S2.schoolName);

    Student S3 = new Student();
    S3.schoolName = "ABC";
  }
}

class Student {
  // function
  static int returnPercentage(int math, int phy, int chem) {
    return (math + phy + chem) / 3;
  }

  String name;
  int roll;

  static String schoolName;

  void setName(String name) { this.name = name; }
  String getName() { return this.name; }
}
