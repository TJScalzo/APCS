public class ProblemThree
{
    private String[][] array;
    
    public ProblemThree()
    {
        String[][] array = {{"Hey","Hello","Hi"},{"Hey","Hello","Hi"},{"Hey","Hello","Hi"},{"Hey","Hello","Hi"}};
        this.array = array;
    }
    
    public void forPrint()
    {
        for (int r = 0; r < array.length; r++) {
            for(int c = 0; c < array[r].length; c++) {
                System.out.print(array[c][r]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}