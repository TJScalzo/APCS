public class forCHALLENGE
{
    public static void main(String[] args)
    {
        int row;
        int lastNumber = 0;
        for (row = 1; row <= 4; row++) {
            for (int count = lastNumber+1; count <= row*7; count++) {
                System.out.print(count + "  ");
                lastNumber = count+1;
            }
            System.out.println();
        }
    }
}