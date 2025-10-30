public class Boggle {
    
    //variables
    char[][] letters = null;
    char[][] result = new char[4][4];
    String resultC = "";
    int temp;
    //constructor
    public Boggle(){
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
        result = new char[][] {
            {'-','-','-','-'},
            {'-','-','-','-'},
            {'-','-','-','-'},
            {'-','-','-','-'}
        };
    }
    //methods
    public void shake(){
        Dice d1 = new Dice();
        int rr = 0;
        int cc = 0;
        for (int r=0; r<16;r++){
            do {
                rr=(int)(Math.random()*4);
                cc=(int)(Math.random()*4);
            }
            while(result[rr][cc]!='-');
            result[rr][cc] = letters[r][d1.roll()-1];
        }
    }
    
    public String toString(){
        for (int rf = 0; rf<4; rf++){
            for (int cf = 0; cf<4; cf++){
                resultC+=((result[rf][cf])+" ");
            }
            resultC+=("\n");
        }
        return resultC;
    }
}
