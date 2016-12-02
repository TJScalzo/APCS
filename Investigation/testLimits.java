public class testLimits
{
    public static void main(String[] args)
    {
        long value = 1;
        for (int i = 0; i < 100; i++)
        {
          	System.out.println("2 to the " + i + " = " + value);
          	value = value * 2;
          	// When you run this 31 times as int it gets weird, becomes negative, and then is just 0.
          	// When you run this with long it's fine until 63.
          	// I believe the reason for this is int and long can only hold so much data, when the number gets that large it overflows and does weird stuff.
        }
    }
}