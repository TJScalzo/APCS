public class ifAge
{
    public static void main(String[] args)
    {
        int age = 2;
        if (age >= 16)
        {
            System.out.println("You're older than 16!");
        }
        else if (age <= 2)
        {
            System.out.println("Are you sure you're " + age + " years old?");
            System.out.println("No one that age should even be able to drive, let alone use a computer!");
        }
        else
        {
            System.out.println("No driving for you...");
        }
     }
}