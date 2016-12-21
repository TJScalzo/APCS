public class scroll
{
    public static void main(String[] args)
    {
        String s = "Some kind of test string";
        System.out.println("The result of scroll is: " + scroll(s));
    }

    public static String scroll(String input)
    {
        String firstLetter = input.substring(0, 1);
        String restOfString = input.substring(1);
        return restOfString + firstLetter;
    }
}