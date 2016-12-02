public class doubleTrouble
{
    public static void main(String[] args)
    {
        double sum = 0.0;
        for (int i = 0; i < 20; i++)
        {
            System.out.println(sum);
            sum = sum + 0.4;
            // It has weird decimal issues; what should just be 0 isn't.
            // I believe the reason for this is the space needed to store decimals is infinite and so when it rounds it adds weird numbers onto the end.
        }
    }
}