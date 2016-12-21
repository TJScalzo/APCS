public class removeMiddle
{
    public static void main(String[] args)
    {
        String s = "Some kind of test string";
        System.out.println("The result of removeMiddle is: " + removeMiddle(s));
    }

    public static String removeMiddle(String input)
    {
        int length = input.length();
        String first;
        String last;
        if (length % 2 == 0) { // length is even
            first = input.substring(0, (length/2)-1);
            last = input.substring((length/2)+1, length);
        } else { // length is odd
            first = input.substring(0, length/2);
            last = input.substring(length/2+1, length);
        }
        return first + last;
    }
}