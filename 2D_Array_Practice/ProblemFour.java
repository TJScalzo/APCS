public class ProblemFour
{
    private int[][] array;
    
    public ProblemFour()
    {
        array = new int[10][10];
        for (int r = 0; r < array.length; r++)
            for(int c = 0; c < array[0].length; c++)
                array[r][c] = r+c;
    }
    
    public ProblemFour(int size)
    {
        array = new int[size][size];
        for (int r = 0; r < array.length; r++)
            for(int c = 0; c < array[0].length; c++)
                array[r][c] = r+c;
    }
    
    public void printAll()
    {
        for (int c = 0; c < array[0].length; c++) {
            for(int r = 0; r < array.length; r++) {
                System.out.print(array[r][c]);
                String numberSpacing = "  "; 
                if (array[r][c] >= 10)
                    numberSpacing = " ";
                System.out.print(numberSpacing);
            }
            System.out.println();
        }
    }
    
    public void printMajorDiagonals()
    {
        for (int c = 0; c < array[0].length; c++) {
            for(int r = 0; r < array.length; r++) {
                if (r == c || r + c == array[0][array.length-1])
                    System.out.print(array[r][c]);
                else if (array[r][c] < 10) 
                    System.out.print(" ");
                else
                    System.out.print("  ");
                String numberSpacing = "  "; 
                if (array[r][c] >= 10)
                    numberSpacing = " ";
                System.out.print(numberSpacing);
            }
            System.out.println();
        }
    }
    
    
    public void printRightDiagonals()
    {
        for (int d = -array.length; d < array.length; d++) {
            for (int c = 0; c < array[0].length; c++) {
                for(int r = 0; r < array.length; r++) {
                    if (r+d == c)
                        System.out.print(array[r][c]);
                    else if (array[r][c] < 10 && r+d < 1) 
                        System.out.print(" ");
                    else if (r+d != 0)
                        System.out.print("  ");
                    String numberSpacing = "  "; 
                    if (array[r][c] >= 10)
                        numberSpacing = " ";
                    System.out.print(numberSpacing);
                }
                System.out.println();
            }
        }
    }
    
    /*
    public void printAllDiagonals()
    {
        for (int d = -array.length; d < array.length; d++) {
            for (int c = 0; c < array[0].length; c++) {
                for(int r = 0; r < array.length; r++) {
                    if (r+d == c)
                        System.out.print(array[r][c]);
                    else if (array[r][c] < 10) 
                        System.out.print("-");
                    else
                        System.out.print("--");
                    if (c < array[0].length-1) {
                        String numberSpacing = "--"; 
                        if (array[r][c] >= 10)
                            numberSpacing = "-";
                        System.out.print(numberSpacing);
                    }
                }
                System.out.println();
            }
            System.out.println();
            for (int c = 0; c < array[0].length; c++) {
                for(int r = 0; r < array.length; r++) {
                    if (r + c == d || r + c == -d)
                        System.out.print(array[r][c]);
                    else if (array[r][c] < 10) 
                        System.out.print("-");
                    else
                        System.out.print("--");
                    if (r < array.length-1) {
                        String numberSpacing = "--"; 
                        if (array[r][c] >= 10)
                            numberSpacing = "-";
                        System.out.print(numberSpacing);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    */
}