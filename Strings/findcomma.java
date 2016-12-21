public class findcomma
{
    public static void main(String[] args)
    {
        String s = "Some kind of test string";
        System.out.println("The result of findComma is: " + findComma(s));
    }

    public static int findComma(String input)
    {
        return input.indexOf(',');
    }
}