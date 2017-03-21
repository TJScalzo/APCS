public class ProblemOne
{
    private int[][] array;
    
    public ProblemOne()
    {
        array = new int[5][7];
    }
    
    public void set3()
    {
        for (int r = 0; r < array.length; r++)
            for(int c = 0; c < array[r].length; c++) {
                array[r][c] = 3;
            }
    }
}