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
        boolean squareIsBlack = blackSquares[r][c];
        if (!squareIsBlack) { //Square is white
            if (r == 0 || c == 0)
                return true;
            if ((!blackSquares[r-1][c]) || !blackSquares[r][c-1]) { //Square to the left or square above are white
                if (blackSquares[r-1][c])
                    return true;
                if (blackSquares[r][c-1])
                    return true;
                return false;
            }
            return true;
        } else { //Square is black
            return false;
        }
    }
    
    public Square[][] getPuzzle()
    {
        return puzzle;
    }
}