public class Drink implements MenuItem
{
    private String name;
    private double price;
    
    public Drink()
    {
        name = "drink";
        price = 3.99;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
}