public class isVowel
{
    public static void main(String[] args)
    {
        String s = "Some kind of test string";
        System.out.println("The result of isVowel is: " + isVowel(s));
    }

    public static boolean isVowel(String input)
    {
        if ("aAeEiIoOuU".indexOf(input.substring(0, 1)) >= 0)
            return true;
        else
            return false;
    }
}