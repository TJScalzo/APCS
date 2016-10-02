public class Fibonacci
{
    public static void main(String[] args)
    {
        int num = 7; // Change this variable to alter how much is generated
        int count = 0;
        int base = 0;
        int next = 1;
        int old;
        while (count < num) {
            System.out.println(base);
            old = base;
            base = base + next;
            next = old;
            count++;
        }
    }
}