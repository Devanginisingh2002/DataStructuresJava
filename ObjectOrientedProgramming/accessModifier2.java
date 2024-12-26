import java.util.*;
public class accessModifier2 {
  public static void main(String args[]) {
    BankAccount myAcc = new BankAccount();
    myAcc.username = "Devangini Singh";
    // myAcc.password = "password@dev";   // we cannt access password like this,
    // because we are using private modifier.
    myAcc.setPassword("password@dev");
  }
}

class BankAccount {
  public String username;
  private String password;

  public void setPassword(String pass) { password = pass; }
}
