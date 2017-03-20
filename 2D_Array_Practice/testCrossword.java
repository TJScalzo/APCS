public class testCrossword
{
    public static void main(int r, int c)
    {
        boolean[][] blackSquares = {{true,false,false,true},{false,false,true,false},{true,true,true,false},{false,true,true,true}};
        Crossword crossword = new Crossword(blackSquares);
        
        System.out.println(crossword.toBeLabeled(r, c, blackSquares));
    }
    
    public static void aux()
    {
        boolean[][] blackSquares = {{true,false,false,true},{false,false,true,false},{true,true,true,false},{false,true,true,true}};
        Crossword crossword = new Crossword(blackSquares);
        Square[][] puzzle = crossword.getPuzzle();
        for (int r = 0; r < puzzle.length; r++)
            for(int c = 0; c < puzzle[0].length; c++) {
                System.out.print(puzzle[r][c].getIsBlack());
                System.out.print(" " + puzzle[r][c].getNum());
                System.out.println();
            }
    }
    
    public static void printPuzzle()
    {
        boolean[][] blackSquares = {{true,false,false,true},{false,false,false,false},{true,true,true,false},{false,true,true,true}};
        Crossword crossword = new Crossword(blackSquares);
        Square[][] puzzle = crossword.getPuzzle(); 
        for (int r = 0; r < puzzle.length; r++) {
            for(int c = 0; c < puzzle[0].length; c++) {
                if (puzzle[r][c].getIsBlack()) {
                    System.out.print("█");
                } else {
                    System.out.print(puzzle[r][c].getNum());
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

