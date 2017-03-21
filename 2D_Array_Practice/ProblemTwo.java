public class ProblemTwo
{
    private String[][] array;
    
    public ProblemTwo()
    {
        String[][] array = {{"Hey","Hello","Hi"},{"Hey","Hello","Hi"},{"Hey","Hello","Hi"},{"Hey","Hello","Hi"}};
        this.array = array;
    }
    
    public void forPrint()
    {
        for (int r = 0; r < array.length; r++) {
            for(int c = 0; c < array[r].length; c++) {
                System.out.print(array[r][c]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public void forEachPrint()
    {
        for (String[] arr : array) {
            for (String value : arr)
                System.out.print(value + " ");
            System.out.println();
        }
    }
}