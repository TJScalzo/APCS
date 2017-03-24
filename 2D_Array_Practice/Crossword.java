public class Crossword
{
    private Square[][] puzzle;
    
    public Crossword(boolean[][] blackSquares)
    {
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        
        int num = 1;
        for (int r = 0; r < blackSquares.length; r++)
            for(int c = 0; c < blackSquares[0].length; c++) {
                int numIn = 0;
                if (toBeLabeled(r, c, blackSquares)) {
                    numIn = num;
                    num++;
                }
                puzzle[r][c] = new Square(blackSquares[r][c], numIn);
            }
    }
    
    public boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
    {
        if (!blackSquares[r][c]) { //Square is white
            if (r == 0 || c == 0) //Square is in top row or left column
                return true;
            else if (blackSquares[r-1][c] || blackSquares[r][c-1]) //Square above is black
                return true;
            else 
                return false;
        } else { //Square is black
            return false;
        }
    }
    
    public Square[][] getPuzzle()
    {
        return puzzle;
    }
}