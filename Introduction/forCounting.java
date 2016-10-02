public class forCounting
{
    public static void main(String[] args)
    {
        // Count up to 20
        for (int count = 1; count <= 20; count++) {
            System.out.println(count);
        }
        System.out.println("");
        // Count down from 20
        for (int count = 20; count > 0; count--){
            System.out.println(count);
        }
        System.out.println("0!");
        System.out.println("");
        // Count up to 21 by 3s
        for (int count = 0; count <= 21; count = count+3){
            System.out.println(count);
        }
        System.out.println("");
        // Count down to 4 from 28 by 4s
        for (int count = 28; count <= 28 && count >= 4; count = count-4){
            System.out.println(count);
        }
    }
}