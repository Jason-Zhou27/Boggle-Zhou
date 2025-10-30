public class Dice {
    
    //variables
    int numSides;
    //constructor
    public Dice(){
        numSides = 6;
    }
    public Dice(int n){
        numSides = n;
    }
    //methods
    public int roll(){
        return (int)(Math.random()*6+1); //I undo the +1 with a -1 within the Boggle class
    }
    
}
