public class Salad implements MenuItem
{
    private String name;
    private double price;
    
    public Salad()
    {
        name = "salad";
        price = 6.99;
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