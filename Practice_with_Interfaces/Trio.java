public class Trio implements MenuItem
{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    private String name;
    private double price;
    
    public Trio()
    {
        sandwich = new Sandwich();
        salad = new Salad();
        drink = new Drink();
        
        name = createName(sandwich.getName(), salad.getName(), drink.getName());
        
        double p1 = sandwich.getPrice();
        double p2 = salad.getPrice();
        double p3 = drink.getPrice();
        
        price = p1 + p2 + p3 - Math.min(p1, Math.min(p2, p3));
    }
    
    private String createName(String sandwichName, String saladName, String drinkName)
    {
        return sandwichName + "/" + saladName + "/" + drinkName;
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