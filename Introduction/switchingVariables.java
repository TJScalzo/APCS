public class switchingVariables
{
    public static void main(String[] args)
    {
        int x = 33;
        int y = 77;
        // System.out.println("Variables: x is " + x + " and y is " + y);
        int z = x;
        // System.out.println("Variables: x is " + x + ", y is " + y + ", and z is " + z + ".");
        x = y;
        y = z;
        System.out.println("Variables: x is now " + x + " and y is now " + y + ".");
    }
}