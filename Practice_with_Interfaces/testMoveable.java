public class testMoveable
{
    public static void main(String args[])
    {
        Moveable t1 = new Person();
        System.out.println(t1.move());
        Moveable t2 = new Pet();
        System.out.println(t2.move());
        
        System.out.println();
        
        Moveable[] t3 = new Moveable[3];
        t3[0] = new Person();
        t3[1] = new Pet();
        t3[2] = new Person();
        for(int i = 0; i < t3.length; i++)
            System.out.println(t3[i].move());
    }
}
