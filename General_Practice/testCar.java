public class testCar
{
    public static void main(String args[])
    {
        Car c1 = new Car();
        Car c2 = new Car("Zotye", "E200 EV", "blue", 499.99, 3);

        c1.printReport();
        c2.printReport();

        c1.setPrice(5500000);
        c2.drive(150);
        c1.printReport();
        c2.printReport();

        System.out.println("The car is a beautiful shade of " + c1.getColor());
    }
}