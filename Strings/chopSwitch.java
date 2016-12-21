public class chopSwitch
{
    public static void main(String[] args)
    {
        String s = "Some kind of test string";
        System.out.println("The result of chopSwitch is: " + chopSwitch(s));
    }

    public static String chopSwitch(String input)
    {
        int length = input.length();
        int halfLength = (int)(length/2);
        String first;
        String last;
        first = input.substring(0, halfLength);
        last = input.substring(halfLength);
        return last + first;
    }
}