// Jason Zhou
// 11/01/2025
// Boggle-Zhou
// AP CS A - Twyford

//Tester/Runner
public class Main {
  //Main Method
  public static void main(String[] args) {
      Boggle b1 = new Boggle(); //create an instantiation of Boggle (b1)
      b1.shake(); //call the shake method within the Boggle class which creates a 4x4 array out of the dice
      System.out.print(b1.toString()); //print the String representation of the 4x4 array mentioned in line 6
  }
}
