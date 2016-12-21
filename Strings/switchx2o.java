public class switchx2o
{
    public static void main(String[] args)
    {
        String s = "Some kind of test string";
        System.out.println("The result of switchx2o is: " + switchx2o(s));
    }

    public static String switchx2o(String input)
    {
        return input.replaceAll("x", "o");
    }
}