public class Addition
{
    public static void main(String[] args)
    {
        double totalCost = 0.0;
        double costCar = 15000.0;
        double costRing = 234.75;
        double costHouse = 399999.99;
        double costChildren = 100000.0;
        totalCost = costCar + costRing + costHouse + costChildren;
        System.out.println("The sum of everything's cost is $" + totalCost);
    }
}