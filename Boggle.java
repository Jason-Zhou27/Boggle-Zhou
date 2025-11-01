public class Boggle {
    
    //variables
    char[][] letters; //declare 2D array letters w/o assigning values or setting size
    char[][] result = new char[4][4]; //declare 2D array result setting size to 4x4 w/o assigning values 
    String resultC = ""; //resultC, short for resultConcactenation, is declared and initialized to an empty String; it will eventually be used in toString
    int rr; //rr represents the row of the 4x4 results array
    int cc; //cc represents the column of the 4x4 results array

    //constructor w/ no parameters; default consstructor
    public Boggle(){
		//initialize the letters array w/ the characters of all dice; size is set to 16x6; each row represents a dice and the columns in each row represent the sides of the dice
        letters = new char[][] {
            {'R', 'I', 'F', 'O', 'B', 'X'},
            {'I', 'F', 'E', 'H', 'E', 'Y'},
            {'D', 'E', 'N', 'O', 'W', 'Y'},
            {'U', 'T', 'O', 'K', 'N', 'D'},
            {'H', 'M', 'S', 'R', 'A', 'O'},
            {'L', 'U', 'P', 'E', 'T', 'S'},
            {'A', 'C', 'I', 'T', 'O', 'A'},
            {'Y', 'L', 'G', 'K', 'U', 'E'},
            {'Q', 'B', 'M', 'J', 'O', 'A'},
            {'E', 'H', 'I', 'S', 'P', 'N'},
            {'V', 'E', 'T', 'I', 'G', 'N'},
            {'B', 'A', 'L', 'I', 'Y', 'T'},
            {'E', 'Z', 'A', 'V', 'N', 'D'},
            {'R', 'A', 'L', 'E', 'S', 'C'},
            {'U', 'W', 'I', 'L', 'R', 'G'},
            {'P', 'A', 'C', 'E', 'M', 'D'}
        };
        //initialize the results array with dashes to signal empty space 
        result = new char[][] {
            {'-','-','-','-'},
            {'-','-','-','-'},
            {'-','-','-','-'},
            {'-','-','-','-'}
        };
    }
    //methods
    
    //shake converts 16 randomized values (one from each row) into a 4x4 array randomly
    public void shake(){
        Dice d1 = new Dice(); //instantiation of Dice class; a single dice is rolled repeatedly to determine the result of each regular letter dice
        //use a for loop to circulate through/place each of the 16 character values on the 4x4 array
        for (int r=0; r<16;r++){
            //use a do while loop to pick a random spot on the 4x4 array, see if it is occupied--and if not, place the value (1/16) into the 4x4 array
            //do while is necessary as the iteration needs to run an indefinite amount of times until the program finds an empty spot; condition needs to be checked afterward because the random location is generated in the do while loop 
            do {
                rr=(int)(Math.random()*4);
                cc=(int)(Math.random()*4);
            }
            while(result[rr][cc]!='-'); //keep randomizing position in 4x4 array until arrives on a -, signaling an empty spot
            result[rr][cc] = letters[r][d1.roll()-1]; //assign the character value of 1/16 dice to that position in the 4x4 results array; d1.roll()-1 is necessary as dice goes from 1-6 while array goes from column 0-5
            //see Dice class for explanation why I did not make dice go from 0-5
        }
    }
    
    public String toString(){
		//circulate through the 4x4 results array, concactenating each value into resultsC with rf and cf for array transversal--representing row and column of the final array respectively
        for (int rf = 0; rf<4; rf++){
            for (int cf = 0; cf<4; cf++){
                resultC+=((result[rf][cf])+" "); //add a space between each character for syntax purposes
            }
            resultC+=("\n");//after a row is transversed, make a new line
        }
        return resultC; //return the String representation of the 4x4 results array
    }
}
