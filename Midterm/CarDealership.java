public class CarDealership
{
    //fields
    private String name;
    private Car car1;
    private Car car2;
    private Car car3;
    
    //constructors
    public CarDealership()
    {
        name = "Chuck's Trucks";
        car1 = new Car();
        car2 = new Car();
        car3 = new Car();
    }
    
    public CarDealership(String name, Car car1, Car car2, Car car3)
    {
        this.name = name;
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;
    }
    
    //methods
    public String getName()
    {
        return name;
    }
    
    public Car sellCar1()
    {
        Car temp = car1;
        car1 = null;
        return temp;
    }
    
    public void replaceCar1(Car replacement)
    {
        car1 = replacement;
    }
    
    public void discountAllCars(double amount)
    {
        car1.setPrice(car1.getPrice() - amount);
        car2.setPrice(car2.getPrice() - amount);
        car3.setPrice(car3.getPrice() - amount);
    }
    
    public void printInventory()
    {
        car1.printReport();
        car2.printReport();
        car3.printReport();
    }
}