public class Sandwich implements MenuItem
{
    private String name;
    private double price;
    
    public Sandwich()
    {
        name = "sandwich";
        price = 9.99;
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