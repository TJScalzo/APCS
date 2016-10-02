public class whileCounting
{
    public static void main(String[] args)
    {
        int count = 0;
        while (count < 20) {
            count++;
            System.out.println("The count is now at " + count);
        }
        count = 20;
        while (count > 0) {
            System.out.println(count);
            count--;
        }
        System.out.println("0!");
    }
}