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
        /*
        if (!squareIsBlack && ((r == 0 || !blackSquares[r-1][c]) || (c == 0 || !blackSquares[r][c-1])))
            return true;
        else
            return false;
        */
        /* For testing if it ever needs to be done.*/
        if (!squareIsBlack) {
            System.out.println("Square is white.");
            if (r == 0 || !blackSquares[r-1][c]) {
                System.out.println("Square above is black.");
                return true;
            } else if (c == 0 || !blackSquares[r][c-1]) {
                System.out.println("Square to left is black.");
                return true;
            }
            return false;
        } else {
            System.out.println("Square is black.");
            return false;
        }
    }
    
    public Square[][] getPuzzle()
    {
        return puzzle;
    }
}