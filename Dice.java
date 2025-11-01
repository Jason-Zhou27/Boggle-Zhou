public class Dice {
    
    //variables
    int numSides; //numSides is the number of sides that the dice has
    //constructor (overloaded_
    
    //default constructor, setting numSides to 6
    public Dice(){
        numSides = 6;
    }
    
    //constructor w/ one parameter, setting numSides to the designated value
    public Dice(int n){
        numSides = n;
    }
    //methods
    //the method roll chooses a random integer between 1-6 and returns that value
    public int roll(){
        return (int)(Math.random()*6+1); //Use the format (int)(Math.random)*range+min) to randomize int from 1-6
        //randomized int from 1-6 instead of 0-5 so this Dice Class can be generalized into multiple programs; I undo the +1 with a -1 within the Boggle class
    }
    
}
