public class Crossword
{
    private Square[][] puzzle;
    
    public Crossword(boolean[][] blackSquares)
    {
        // asdf
    }
    
    public boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
    {
        boolean thisSquare = blackSquares[r][c];
        
        if (thisSquare && ((r == 0 || !blackSquares[r-1][c]) || (c == 0 || !blackSquares[r][c-1])))
            return true;
        else
            return false;
        
        /* For testing if it ever needs to be done.
        if (thisSquare) {
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
        */
    }
}