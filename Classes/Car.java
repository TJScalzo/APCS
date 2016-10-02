public class Car
{
    // Fields:
    private double price;
    private int howSoftTheSeatsAre;
    private String lovingPetName;
    // Constructors:
    public Car()
    {
        price = 15000.00001;
        howSoftTheSeatsAre = 8;
        lovingPetName = "Putt-Putt";
    }
    public Car(int soft, String name)
    {
        price = 15000.00001 * soft;
        howSoftTheSeatsAre = soft;
        lovingPetName = name;
    }
    public Car(double price)
    {
        if (price >= 10000)
        {
            howSoftTheSeatsAre = 20;
            lovingPetName = "Bahrb";
        } else if (price < 10000 && price > 1000)
        {
            howSoftTheSeatsAre = 4;
            lovingPetName = "Keightlynn";
        } else if (price <= 1000) {
            howSoftTheSeatsAre = 1;
            lovingPetName = "Jerreigh";
        }
    }
    // Methods:
    public double getPrice()
    {
        return price;
    }
    public int getSoftness()
    {
        return howSoftTheSeatsAre;
    }
    public double raiseSoftness(int howMuch)
    {
        howSoftTheSeatsAre = howSoftTheSeatsAre + howMuch;
        price = price + (howMuch*2000);
        return price;
    }
    public void rename(String newName)
    {
        lovingPetName = newName + " How dare you change my name?";
    }
    public double negotiatePrice(double priceWanted)
    {
        price = priceWanted + 2000;
        return price;
    }
}