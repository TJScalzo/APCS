public class ifTired
{
    public static void main(String[] args)
    {
        int sleepTime = 3;
        boolean isTired;
        System.out.println("You've slept " + sleepTime + " hours.");
        if (sleepTime >= 8)
        {
            isTired = false;
        }
        else if (!(sleepTime > 8))
        {
            isTired = true;
        }
        else
        {
            isTired = false;
        }
        if (isTired == true)
        {
            System.out.println("You should really get some sleep; " + sleepTime + " hours of sleep isn't enough.");
        }
        else
        {
            System.out.println("You have way to much energy! Maybe " + sleepTime + " hours of sleep is too much!");
        }
     }
}