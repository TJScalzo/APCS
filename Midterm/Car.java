/**
 * This class is meant to represent a very simple passenger Car.
 * @author (Tim Barron) 
 * @version (1.0)
 */

public class Car
{
    // fields
    private String make;
    private String model;
    private String color;
    private int year;
    private double price;

    //constructors
    public Car()
    {
        make = "Ford";
        model = "Mustang";
        color = "black";
        year = 2008;
        price = 5000.0;
    }
    
    public Car(String theMake, String theModel, String theColor, int theYear, double thePrice)
    {
        make = theMake;
        model = theModel;
        color = theColor;
        year = theYear;
        price = thePrice;
    }

    //methods
    public String getMake()
    {
        return make;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
    
    public void printReport()
    {
        System.out.println("This car is a " + year + " " + color + " " + make + " " + model +" for sale for $"+ price +" miles.");
    }

}