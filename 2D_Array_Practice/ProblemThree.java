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
        System.out.println();
        for (int c = 0; c < array[0].length; c++) {
            for(int r = 0; r < array.length; r++) {
                System.out.print(array[r][c]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}