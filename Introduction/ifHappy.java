public class ifHappy
{
    public static void main(String[] args)
    {
        boolean isHappy = false;
        boolean atSchool = true;
        if (isHappy)
        {
            System.out.println("Good for you! Stay that way!");
        }
        else
        {
            System.out.println("Aw, what's wrong?");
            if (atSchool)
            {
                System.out.println("Ah, that explains it...");
            }
            else
            {
                System.out.println("Hey, at least you're not at school!");
            }
        }
     }
}