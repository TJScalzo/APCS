public class testCrossword
{
    public static void main()
    {
        boolean[][] blackSquares = {{true,false,false,true},{false,false,true,false},{true,true,true,false},{false,true,true,true}};
        Crossword crossword = new Crossword(blackSquares);
        
        System.out.println(crossword.toBeLabeled(0,0,blackSquares));
    }
}