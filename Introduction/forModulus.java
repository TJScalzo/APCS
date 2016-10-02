public class forModulus
{
    public static void main(String[] args)
    {
        for (int count = 0; count <= 50; count++) {
            if ((count % 2) != 0) {
                System.out.println(count + " is odd.");
            }
            else {
                System.out.println(count + " is even.");
            }
        }
    }
}